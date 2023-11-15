package prac2;

public class factorial
{
    public static void main(String[] args)
    {
        int n = 3; // Число, факториал которого требуется найти
        int factorial = calculateFactorial(n); // Вызов метода
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }

    // Метод для вычисления факториала числа с использованием цикла
    public static int calculateFactorial(int n)
    {
        if (n < 0)
        {
            System.out.println("Вы ввели некорректное значение");
            return 0;
        }
        else
        {
            int factorial = 1;
            for (int i = 1; i <= n; i++)
            {
                factorial = factorial * i;
            }
            return factorial;

        }
    }
}
