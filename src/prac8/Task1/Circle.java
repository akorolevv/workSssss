package prac8.Task1;
import java.awt.*;
import java.util.Random;
class Circle extends Shape
{
    protected int radius;

    public Circle()
    {
        super();
        Random random = new Random();
        this.radius = random.nextInt(50) + 10; // Радиус от 10 до 59
    }

    public Circle(Color color, int x, int y, int radius)
    {
        super(color, x, y);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    // Метод рисования фигуры на интерфейсе

    public void draw(Graphics g)
    {
        g.setColor(getColor()); // Установка цвета
        g.fillOval(getX(), getY(), radius * 2, radius * 2);
        // Рисовка самого круга, поля устанавливаются с помощью геттеров
    }

}