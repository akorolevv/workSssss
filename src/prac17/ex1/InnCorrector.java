package prac17.ex1;

import java.math.BigInteger;
// InnCorrector - пользовательскре исключение, которое расширяет класс Exception

public class InnCorrector extends Exception
{

    private BigInteger innNum; // ИНН

    // Конструктор, который инициализирует объект InnCorrector с номером ИНН и сообщением об ошибке
    public InnCorrector(BigInteger inn)
    {
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    // Геттер для получения номера ИНН
    public BigInteger getInnNum()
    {
        return innNum;
    }
}