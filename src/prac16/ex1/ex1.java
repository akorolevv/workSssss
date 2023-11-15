package prac16.ex1;

// Задание 1

public class ex1
{
    // Шаг 1
    // Ответ: Произойдёт сбой программы и вывод java.lang.ArithmeticException: / by zero at
    // Exception1.exceptionDemo
    public void exceptionDemo()
    {
        System.out.println(2 / 0);
    }


    // Шаг 2
    // Изменить тип чисел с целочисленного на дробный
    // Ответ: при делении получится infinity из-за стандартов Java (IEEE 754)
    public void exceptionDemo_step2()
    {
        System.out.println(2.0 / 0.0);
    }

    // Шаг 3
    // Использование блоков try - catch и с делением на 0
    // Ответ: происходит обработка исключений
    public void exceptionDemo2()
    {
        try
        {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Попытка деления на ноль");
        }
    }

    public static void main(String[] args)
    {
        ex1 e1 = new ex1(); // Создаём экземпляр класса
        System.out.println("Шаг первый, деление на ноль целочисленных чисел: ");
        // e1.exceptionDemo();

        System.out.println("Шаг второй, деление на ноль числе с дробной частью (Произойдёт вывод Infinity): ");
        e1.exceptionDemo_step2();


        System.out.println("Шаг третий, деление на ноль целочисленных чисел с блоками try - catch: ");
        e1.exceptionDemo2();


    }
}