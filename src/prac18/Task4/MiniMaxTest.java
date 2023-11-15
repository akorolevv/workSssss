package prac18.Task4;

public class MiniMaxTest
{
    public static void main(String[] args)
    {
        Integer[] intArray = {3, 7, 1, 9, 4, 6, 2, 8, 5};

        // Создаем объект класса MinMax для массива Integer
        MinMax<Integer> array1 = new MinMax<>(intArray);

        // Находим минимальное и максимальное значение в массиве
        int minInt = array1.findMin();
        int maxInt = array1.findMax();

        // Выводим результаты
        System.out.println("Минимальное значение: " + minInt);
        System.out.println("Максимальное значение: " + maxInt);

        // Повторяем те же шаги для массива с десятичными числами
        Double[] doubleArray = {3.5, 7.2, 1.8, 9.6, 4.0, 6.1, 2.9, 8.7, 5.3};
        MinMax<Double> array2 = new MinMax<>(doubleArray);

        double minDouble = array2.findMin();
        double maxDouble = array2.findMax();

        System.out.println("\nМинимальное значение: " + minDouble);
        System.out.println("Максимальное значение: " + maxDouble);
    }
}
