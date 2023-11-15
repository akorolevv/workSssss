package prac5;
// Квадрат
public class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        super(side,side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) // Переписываем метод, наследуемый от прямоугольника
    {
        this.width = side;

    }

    @Override
    public void setLength(double side) // Переписываем метод, наследуемый от прямоугольника
    {
        this.length = side;
    }

    @Override
    public String toString()
    {
        return "Shape: square. Width: " + getSide() + " Length: " + getSide() + " Color: " + this.color + " Filled:" + this.filled;
    }

}
