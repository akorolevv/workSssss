package prac4;

public class Circle4Test {
    public static void main(String[] args)
    {

        Circle4 circle = new Circle4(5.0);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.Area());
        System.out.println("Длина окружности: " + circle.calculateCircumference());


        circle.setRadius(7.0);
        System.out.println("\nНовый радиус окружности: " + circle.getRadius());
        System.out.println("Новая площадь окружности: " + circle.Area());
        System.out.println("Новая длина окружности: " + circle.calculateCircumference());
    }
}
