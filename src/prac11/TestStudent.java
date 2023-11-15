package prac11;

// Смысл Mergesort
// Разделить массив на 2 равные части, провести сортировку слиянием двух подмассивов, объединить два массива


import java.util.ArrayList;

public class TestStudent
{
    // Сортировка слиянием (MergeSort)
    public static void mergeSort(Student[] a, int n)
    {
        // Проверка, является ли массив пустым/из одного элемента
        if (n < 2)
        {
            return;
        }
        int mid = n / 2; // Находим середину массива
        Student[] l = new Student[mid]; // Пусть будет две части - левая
        Student[] r = new Student[n - mid]; // И правая

        // Копируем элементы из исходного массива в левую и правую части.
        // (массив на вход, элемент с которого начинается копирование в исходном массивае, массив в который копируем, начальный индекс целевого массива, количество элементов)
        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);


        // Рекурссивная сортировка каждой части
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // Объеденение
        // a - массив, в который всё объедиинтся
        // l и r - массивы, которые объединяем
        // mid - индекс середины, чтобы определить, где начнётся правая часть
        // n - mid - количество элементов правой части

        merge(a, l, r, mid, n - mid);
    }


    // Метод для слияния двух отсортированных массивов l и r в массив a.
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0; // Индексы для массивов a, l и r.

        while (i < left && j < right)
        {
            // Сравниваем элементы левой и правой части и записываем минимальный в массив a
            if (l[i].compareTo(r[j]) <= 0)
            {
                a[k++] = l[i++]; // элемент l[i] записываем в a[k] и инкрементируем
            }
            else
            {
                a[k++] = r[j++]; // элемент r[j] записываем в a[k] и инкрементируем
            }
        }

        // Дописываем оставшиеся элементы из левой и правой части, если они есть.
        while (i < left)
        {
            a[k++] = l[i++];
        }
        while (j < right)
        {
            a[k++] = r[j++];
        }
    }


    private  static StudentComp comp = new StudentComp();

    // Метод для сортировки массива объектов с использованием быстрой сортировки.
    public static void qSort(Object[] array, int high, int low) // low - нижняя граница сортировки, high - верхняя граница сортировки
    // т.е. сортировка от low до high
    {
        if(array == null || array.length == 0) return; // Проверка на пустой массив.
        if(high <= low) return; // Если индексы неверны, завершаем выполнение.

        Object middle = array[(low + high)/2]; // Выбираем опорный элемент (по середине).

        // Создаем списки для элементов, меньших, больших и равных опорному.

        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();

        for(int i = low; i <= high; i++) // проходимся по элементам low до high
        {
            if(comp.compare(array[i], middle) > 0) // Сравнение i-го элемента с серединой через компаратор
            // Если результат сравнения положителен (элемент array[i] больше middle), то элемент добавляется в правый подмассив right.
            {
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0) // Если результат сравнения отрицателен (элемент array[i] меньше middle),
                // то элемент добавляется в левый подмассив left.
                left.add(array[i]);
            else eq.add(array[i]); // Если результат сравнения равен нулю (элемент array[i] равен middle), то элемент добавляется в подмассив eq.
        }
        Object[] leftArr;
        Object[] rightArr;

        // Итого мы разделили массив на три части - left right eq

        // Рекурсивно сортируем левую и правую части.

        if(left.size()>0) // если левая часть не пустая
        {
            leftArr = left.toArray(); // копируем в leftArr элементы левой части
            qSort(leftArr, left.size() - 1, 0); // Сортировка рекурсией
            System.arraycopy(leftArr, 0, array, low, left.size()); // Копирование в исходный массив начиная с нижнего индекса
            // leftArr - исходный массив, из которого копируем, 0 - индекс в исходном массиве, с которого начинается копирование
            // array - массив, в который попируем элементы, low - индекс в array с которого идёт вставка
            // left.size() - количество элементов, которое копируем
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0)
        {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }













    public static void main(String[] args)
    {
        Student[] students = new Student[]{
                new Student(12, 12),
                new Student(11, 10),
                new Student(189, 7),
                new Student(2, 300)
        };

        System.out.println("Исходный массив students: ");
        for (Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("\nУпражнение 1 ");
        System.out.println("\nСортировка по IDNum вставками");

        // Сортировка вставками по IDNum.
        for (int i = 1; i < students.length; i++)
        {
            Student current = students[i];
            int j = i-1;
            // Перебираются элементы слева направо
            // Идёт проверка, долже ли current быть перемещён в более раннее место в массиве с помощью current.compareTo(students[j]) < 0,
            // где current сравнивается с элементом слева от него
            // Если нужен сдвиг, сдвигаемому жлементу присваивается j+1

            for(; j >= 0 && current.compareTo(students[j]) < 0; j--)
            {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }

        System.out.println("\nОтсортированный массив с помощью вставок: ");
        for (Student s : students)
        {
            // Вывод отсортированного массива по IDNum.
            System.out.println(s);
        }

        System.out.println("\nУпражнение 2");
        System.out.println("\nБыстрая сортировка по GPA, баллы по убыванию");
        System.out.println();
        qSort(students, students.length-1, 0);
        for (Student s : students)
        {
            System.out.println(s);
        }

        System.out.println("\nУпражнение 3");
        System.out.println("\nСортировка слиянием (Merge-сортировка)");
        System.out.println();
        Student[] students2 = new Student[]{
                new Student(15, 130),
                new Student(10, 105),
                new Student(22, 777),
                new Student(90, 888),
                new Student(84, 144),
                new Student(7, 322)
        };

        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents)
        {
            System.out.println(s);
        }
    }
}
