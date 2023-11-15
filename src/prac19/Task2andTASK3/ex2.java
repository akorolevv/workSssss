package prac19.Task2andTASK3;

public class ex2<T>
{
    private T[] array; // Обобщенный массив для хранения элементов
    private int size;   // Размер массива

    public ex2(int capacity)
    {
        // new Object[capacity] - создание массива типа Object
        // (T[]) - выполняем приведение к типу T

        array = (T[]) new Object[capacity]; // Создаем массив с заданной начальной вместимостью
        size = 0; // Изначально массив пуст
    }

    // Добавление элемента в массив
    public void add(T element)
    {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Массив переполнен.");
        }
    }

    // Получение элемента по индексу
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.println("Индекс вне допустимых границ.");
            return null;
        }
    }

    // Получение размера массива
    public int size()
    {
        return size;
    }

    // Вывод элементов массива
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

