package prac5;
// Круг
public class Circle extends Shape
{
    protected double radius;
    public Circle()
    {
        super(); // Вызывает конструктор родительского класса
        radius = 1; // Заполнение нового поля каким-то значением
    }
    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea() // Формула площади круга
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString()
    {
        return "Shape: circle. Radius: " + this.radius + " Color:" + this.color + " Filled:" + this.filled;
    }
}
