package prac16.ex5;

public class ex5
{
    // Шаг 1
    // Запускаем getDetails с нулём в качестве параметров
    // Вывод будет происходить через printMessage
    public String getDetails(String key)
    {
        if(key == null) // условие ошибки --> выбрасываем исключение
        {
            throw new NullPointerException("null key указан в качестве параметра");
        }
        return "data for " + key;
    }


    // Шаг 2
    // Добавьте блок try-catch таким образом, чтобы перехватить исключение и рассмотреть его внутри метода

    public String getDetails2(String key)
    {
        try
        {
            if (key == null)
            {
                throw new NullPointerException("null key in getDetails");
            }
        }
        // catch перехватит исключение

        catch (NullPointerException e)
        {
            key = "default";
        }
        return "data for " + key;
    }
    public void printMessage2(String key)
    {
        String message = getDetails2(key);
        System.out.println( message );
    }
    public void printMessage(String key)
    {
        String message = getDetails(key);
        System.out.println( message );
    }



    public static void main(String[] args)
    {
        ex5 thrower = new ex5();

        // Шаг 1
        // При передаче корректного значения - всё работает
        // При передаче некорректного значения - вызывается сбой посредством исключения
        // thrower.printMessage("Key");
        // thrower.printMessage(null);

        // Шаг 2
        // При передаче корректного значения - всё работает
        // При передаче некорректного срабатывает блок catch и обрабатывается исключение
         thrower.printMessage2("Key");
         thrower.printMessage2(null);
    }

}