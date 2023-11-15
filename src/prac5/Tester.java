package prac5;

public class Tester
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Ошибка:System.out.println(s1.getRadius()); Метода getRaius()) нету в Shape

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Ошибка: Shape s2 = new Shape(); Невозможно создать объект абстрактного класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // Ошибка: System.out.println(s3.getLength()); Поскольку s3 - переменная типа Shape, в ней нету метода getLength().
        // Переменная s3 - ссылка на объект типа Shape. Поэтому s3 - объект класса Rectangle, но может использовать только функционал Shape

        Rectangle r1 = (Rectangle)s3; // Приведение s3 к типу Rectangle. При этом r1 - ссылка на тот же объект, что и s3, но уже с функционалом Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // Ошибка: System.out.println(s4.getSide()); getSide() не в Shape


        Rectangle r2 = (Rectangle)s4; // Преобразование s4 к Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // Ошибка: System.out.println(r2.getSide()); getSide() не в Rectangle
        System.out.println(r2.getLength());


        // Преобразование Rectangle r2 в Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
