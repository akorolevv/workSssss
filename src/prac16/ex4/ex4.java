package prac16.ex4;

import java.util.Scanner;


public class ex4
{
    // Используем код второго задания
    // Но с блоком finally
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
        catch(Exception e)
        {
            System.out.println("Exception happened!");
        }

    }

    public static void main(String[] args)
    {
        ex4 e4 = new ex4();
        e4.exceptionDemo();
    }
}
