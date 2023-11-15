package prac9.Task2;

public class PriceableTest
{
    public static void main(String[] args)
    {
        Priceable obj1 = new Mouse(5000.0, 16000, "black");
        Priceable obj2 = new Laptop(50000.0, "Lenovo Ideapad");
        System.out.println(obj1); // В выводе задействована реализация интерфейса
        System.out.println(obj2);
    }
}
