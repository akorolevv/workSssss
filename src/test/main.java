package test;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    public static void main(String[] param1)
    {
        // System.out.println("Wassap"); // Просто вывод. println - вывод с новой строки
        int age = 19;
        // byte - малое целочисленное число от -128 до 127, занимает 1 байт
        // short - среднее целочисленное число, от -32768 до 32767, занимает 2 байта
        // int - огромное целочисленное число, занимает 4 байта
        // long - ещё большее целочисленное число, чем int, занимает 8 байт

        // float - число с точкой
        // double - число с точкой, в два раза большее, чем float

        // char - символ, указывается в ' '
        // String - набор из символов, т.е. строки, указывается в " "

        // boolean - true/false

        /* Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String username = scan.nextLine(); // Получение строки от пользователя
        System.out.println("Ваше имя: " + username);

        int num1 = scan.nextInt(); // Получение числа от пользователя

        */







        // Одномерный массив (1 элемент = 1 значение)
        int[] massive = new int[5]; // new - выделение памяти, после new указываем то, сколько памяти выделяем.
        massive[0] = 5;
        System.out.println(massive[0]);

        float[] massive2 = new float[] {5.0f, 3.0f};
        System.out.println(massive2[0]);

        // Двумерный массив (Каждый элемент представляет из себя ещё один массив)
        char[][] mnogomerka = new char[3][2]; // 3 - количество массивов внутри двумерного массива, 2 - количество элементов в каждом массиве






        // КОЛЛЕКЦИИ
        // Создание листа. Можно добавлять сколько угодно элементов, т.е. это динамический массив
        // ArrayList - удобен, если добавили элементы и дальше с ними работаем.
        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add((int) 7);
        numbers.add(1, 10);
        for (Integer el:numbers)
        {
            System.out.println(el);
        }

        // LinkedList - удобен, если надо много удалять или удалять.
        LinkedList<Float> numbers2 = new LinkedList<>();

       */
        info();

    }

    public static void info()
    {
        System.out.println("Hello!");
    }



























}
