package prac18.Task4;

public class Calculator
{
    public static <T extends Number, U extends Number> double sum(T num1, U num2)
    {
        // Метод doubleValue()
        // используется для получения числового значения объекта Number в виде значения с плавающей точкой типа double.
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T num1, U num2)
    {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T num1, U num2)
    {
        if (num2.doubleValue() == 0)
        {
            throw new ArithmeticException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T num1, U num2)
    {

        return num1.doubleValue() - num2.doubleValue();
    }
}

