package prac24_ready;

public class IllegalTableNumber extends RuntimeException
{
    public IllegalTableNumber(int tableNumber) {
        super("Столика с номером " + tableNumber + " не существует");
    }
}

