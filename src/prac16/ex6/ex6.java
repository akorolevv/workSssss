package prac16.ex6;

public class ex6
{
    // Переделать программу, чтобы она не ломалась
    public void printMessage(String key)
    {


        // Блоки try catch перенесены в printmessage
        try
        {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e)
        {
            System.out.println("Ошибка");
        }

    }
    public String getDetails(String key)
    {
        if (key == null)
        {
            throw new NullPointerException();
        }
        return "data for " + key;

    }

    public static void main(String[] args)
    {
        ex6 ex6 = new ex6();

        ex6.printMessage("aaaa");
        ex6.printMessage(null);
    }
}