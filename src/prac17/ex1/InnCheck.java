package prac17.ex1;


import java.math.BigInteger;
import java.util.Scanner;



public class InnCheck
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Введите номер ИНН");
            try
            {
                BigInteger inn =  new BigInteger(sc.nextLine()); // Записываем ИНН в inn
                checkInn(inn); // Метод проверки ИНН
                break;
            }
            catch (InnCorrector e) // Блок catch обрабатывающий пользовательское исключение
            {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(BigInteger inn) throws InnCorrector
    {
        int i = 0;

        // Создание копии номера ИНН для обработки
        // new BigInteger ождиает в качестве аргументов байтовый массив, поэтому мы переводим инн в байтовый массив с помощью inn.toByteArray()
        BigInteger cInn = new BigInteger(inn.toByteArray());

        // Подсчет количества цифр в номере ИНН
        // Будем удалять цифры из числа до тех пор, пока оно не станет равно нулю

        while (!cInn.equals(new BigInteger("0")))
        {
            i++;

            // Сначала cInn делится на 10 с помощью cInn.divide(new BigInteger("10"))
            // Результат преобразуется в байтовый массив и создаётся уже новый объект BigInteger

            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        // Если ИНН состоит не из 10, 11, 12 чисел --> номер неверный --> вызываем пользовательское исключение
        if(i != 10 && i != 11 && i != 12) throw new InnCorrector(inn);
        return true;
    }
}