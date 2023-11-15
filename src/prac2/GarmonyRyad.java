package prac2;

public class GarmonyRyad
{
    // Гармонический ряд - числовой ряд, представленный в виде суммы обратных значений натуральных чисел
    // H_n = 1 + 1/2 + 1/3 + 1/4 .. + 1/n

    public static void main(String[] args)
    {
        int n = 10;
        double result = 0.0;
        for (int i = 1; i <= n; i++)
        {
            result = result + 1.0 / i;
            System.out.println("Число " + i + ": " + result);
        }
    }
}
