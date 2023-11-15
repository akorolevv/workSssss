package prac16.ex3;

import java.util.Scanner;



public class ex3
{
    // Теперь мы используем тот же код, но появляется блок catch Exception
    // catch Exception - будет обрабатывать общее исключение класса Exception
    // Expection - суперкласс для многих стандартных исключений
    public void exceptionDemo()
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
            System.out.println("Not correct number");
        }
        catch(Exception e)
        {
            System.out.println("Exception happened!");
        }
    }

    public static void main(String[] args)
    {
        ex3 e3 = new ex3();
        e3.exceptionDemo();
        System.out.println("Теперь программа обрабатывает любые исключения, благодаря catch(Exception e)");
    }
}