package prac18.Task4;

public class CalculatorTest
{
    public static void main(String[] args)
    {
        // Тестируем с целыми числами
        int a = 10;
        int b = 5;
        System.out.println("Сумма: " + Calculator.sum(a, b));           // Сумма: 15
        System.out.println("Умножение: " + Calculator.multiply(a, b)); // Умножение: 50
        System.out.println("Деление: " + Calculator.divide(a, b));     // Деление: 2.0
        System.out.println("Вычитание: " + Calculator.subtract(a, b)); // Вычитание: 5.0

        // Тестируем с числами с плавающей точкой
        double x = 3.14;
        double y = 1.5;
        System.out.println("Сумма: " + Calculator.sum(x, y));           // Сумма: 4.64
        System.out.println("Умножение: " + Calculator.multiply(x, y)); // Умножение: 4.71
        System.out.println("Деление: " + Calculator.divide(x, y));     // Деление: 2.0933333333333333
        System.out.println("Вычитание: " + Calculator.subtract(x, y)); // Вычитание: 1.64
    }
}
