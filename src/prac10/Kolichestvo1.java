package prac10;

// Дана последовательность натуральных чисел (одно число в строке),
// завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
// последовательности встречается число 1. Числа, идущие после двух нулей,
// необходимо игнорировать.

public class Kolichestvo1
{
    public static void main(String[] args)
    {
        String example = "111256301002211"; // Пример последовательности
        int count = countOnes(example);
        System.out.println("Количество единиц: " + count);
    }

    public static int countOnes(String sequence)
    {
        // Базовый случай
        // Последовательность пустая (.isEmpty()) или начинается с двух нулей
        if (sequence.isEmpty() || sequence.startsWith("00"))
        {
            // Если последовательность пуста или начинается с "00", завершаем рекурсию.
            return 0;
        }

        // Получение первой цифры последовательности
        // Character.getNumericValue - преобразует символ в численное значение
        // sequence.charAt(0) - получение символа по индексу, в данном случае индекс 0

        int firstDigit = Character.getNumericValue(sequence.charAt(0));

        if (firstDigit == 1)
        {
            // Если первая цифра - единица, увеличиваем счетчик на 1
            // и рекурсивно вызываем функцию для оставшейся части последовательности.
            return 1 + countOnes(sequence.substring(1)); // sequence.substring(1) - возвращает подстроку, начиная с индекса 1
        }
        else
        {
            // Если первая цифра - другая цифра, просто рекурсивно вызываем функцию
            // для оставшейся части последовательности.
            return countOnes(sequence.substring(1));
        }
    }
}

