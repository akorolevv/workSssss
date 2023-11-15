package prac16.ex8;

import java.util.Scanner;

public class ex8
{
    // Удаляем throws Exception из GetKey(), добавляем блоки try catch в getkey
    // Сделать возможность многократного ввода
    public void getKey()
    {
        Scanner myScanner = new Scanner(System.in);

        boolean incor = false;
        do
        {
            incor = false;
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try
            {
                printDetails(key);
            }
            catch (Exception e)
            {
                incor = true;
            }
        }
        while (incor == true);
    }

    public void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception
    {
        if(key.equals(""))
        {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args)
    {
        ex8 td = new ex8();
        try
        {
            td.getKey();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
