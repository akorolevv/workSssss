package prac19.Task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Написать метод для конвертации массива строк/чисел в список.

public class ex1
{
    public static <T> List<T> convertToList(T array[])
    {
        // Создание нового ArrayList, который будет хранить элементы
        List<T> list = new ArrayList<>();
        // Добавление элементов из массива в список с помощью метода Collections.addAll
        Collections.addAll(list, array);

        // Возврат списка
        return list;

    }
    public static void main(String[] args)
    {
        // Создание массива целых чисел и сразу заполняем его, поскольку он имеет фиксированную длину
        Integer[] number = new Integer[] {1, 2, 3, 4, 5};
        List<Integer> list1 = convertToList(number);

        String[] string = new String[] {"Object1", "Object2", "Object3"};
        List<String> list2 = convertToList(string);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);



    }
}