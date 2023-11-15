package prac2;

public class SumOfDigitsInMassive
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summa_for = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            summa_for = summa_for + numbers[i];
        }
        System.out.println("Нахождение суммы с помощью цикла for: " + summa_for);

        int j = 0;
        int summa_while = 0;
        while (j < numbers.length)
        {
            summa_while = summa_while + numbers[j];
            j++;
        }
        System.out.println("Нахождение суммы с помощью цикла while: " + summa_while);

        int k = 0;
        int summa_dowhile = 0;
        do
        {
            summa_dowhile = summa_dowhile + numbers[k];
            k++;
        }
        while (k < numbers.length);
        System.out.println("Нахождение суммы с помощью цикла do while: " + summa_dowhile);

















    }
}
