package prac5;
// прямоугольник

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        super();
        width = 22.1;
        length = 23.4;
    }

    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;

    }
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;

    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;

    }
    @Override
    public double getArea() // Площадь прямоугольника
    {
        return length*width;
    }
    @Override
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    @Override
    public String toString()
    {
        return "Shape: rectangle. Length: " + this.length + " Width: " + this.width + " Color:" + this.color + " Filled:" + this.filled;
    }

}
