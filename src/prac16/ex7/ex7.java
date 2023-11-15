package prac16.ex7;
import java.util.Scanner;

// Блок «throws» – используется в сигнатуре метода, для указания того, что метод может сгенерировать исключение определённого типа,
// но не обязательно обрабатывать его.
// В моём случае обработкой занимается main

public class ex7


{
    // Добавить throws Exception
    public void getKey() throws Exception
    {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails(key);
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
            throw new Exception("Ключ равен пустой строке");
        }
        return "data for " + key;
    }

    public static void main(String[] args)
    {
        ex7 td = new ex7();
        // Исключение возникает в getDetails, поскольку указан throws, исключение может обрабатываться в методе или передаваться дальше
        // В нашем случае, исключение передаётся по цепочке getDetails --> printDetails --> getKey

        try
        {
            td.getKey();
        }
        catch (Exception e)
        {
            // Список методов, которые вызывались перед исключением
            System.out.println("Сбой в программе, main обрабатывает исключение:");
            // e.printStackTrace();
        }
    }
}
