package prac24_ready;

//  попытке добавить заказ столику , если со столиком  уже связан заказ

public class OrderAlreadyException extends Exception
{
    public OrderAlreadyException(int ex){
        super("Столик " + ex + " уже занят!");
    }
}
