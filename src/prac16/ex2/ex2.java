package prac16.ex2;
import java.util.Scanner;


public class ex2
{
    // Шаг 1, Шаг 2
    // Запустить код с данными на ввод: qwerty или 0 или 1.2
    // Ответ: при запуске с такими входными данными будет NumberFormatException, ArithmeticException
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }

    // Шаг 3
    // Тот же код, но с блоками try - catch
    public void exceptionDemo2()
    {
        try
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введено некорректное число");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Введено некорректное число");
        }
    }

    public static void main(String[] args)
    {
        ex2 e2 = new ex2();

        // Шаг 1, шаг 2
         System.out.println("При запуске будет выбрасываться исключение NumberFormatException, ArithmeticException");
        // e2.exceptionDemo();

         System.out.println("Новый запуск предыдущего кода с обработкой исключений: ");
         e2.exceptionDemo2();
    }
}