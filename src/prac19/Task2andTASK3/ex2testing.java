package prac19.Task2andTASK3;

public class ex2testing
{
    public static void main(String[] args)
    {
        ex2<Integer> intArrayHolder = new ex2<>(5);
        intArrayHolder.add(1);
        intArrayHolder.add(2);
        intArrayHolder.add(3);
        intArrayHolder.add(4);

        ex2<String> strArrayHolder = new ex2<>(3);
        strArrayHolder.add("Word1");
        strArrayHolder.add("Word2");

        System.out.println("Integer Array:");
        intArrayHolder.printArray();

        System.out.println("String Array:");
        strArrayHolder.printArray();

        System.out.println("String Array:");
        strArrayHolder.printArray();
        System.out.println("Element at index 1: " + strArrayHolder.get(1)); // Получение элемента по индексу
    }
}
