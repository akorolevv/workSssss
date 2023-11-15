package prac8.Task1;
import java.awt.*;
import java.util.Random;
abstract class Shape
{
    protected Color color;
    protected int x;
    protected int y;

    public Shape()
    {
        Random random = new Random();
        // Три компонента: красный/зелёный/синий
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Рандомные числа для x и y до 400
        this.x = random.nextInt(400); // Максимальное значение для x
        this.y = random.nextInt(400); // Максимальное значение для y
    }
    public Shape(Color color, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
