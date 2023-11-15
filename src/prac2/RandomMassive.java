package prac2;
import java.util.Arrays;
import java.util.Random;


public class RandomMassive
{
    public static void main(String[] args)
    {
        // Создаем генератор случайных чисел
        Random random = new Random();

        // Задаем размер массива
        int size = 10; // Измените на желаемый размер массива

        // Создаем массив целых чисел и заполняем его случайными значениями
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        // Выводим исходный массив на экран
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Сортируем массив
        Arrays.sort(array);

        // Выводим отсортированный массив на экран
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}
