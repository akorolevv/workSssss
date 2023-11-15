package prac1;

public class TestBasket_ball
{
    public static void main(String[] args)
    {
        // Создадим экземпляр класса
        System.out.println("Первый мяч: ");
        Basket_ball ball1 = new Basket_ball();
        System.out.println(ball1);
        ball1.setBrand("Mikasa"); // Изменение бренда мяча
        System.out.println(ball1);

        // Создадим второй экземпляр с помощью второго конструктора
        System.out.println("Второй мяч: ");
        Basket_ball ball2 = new Basket_ball(7, "Torres", "indoor");
        System.out.println(ball2);
        int a;
        a = ball2.getSize();
        System.out.println("Размер мяча, занесённый в переменную a: " + a);


    }
}
