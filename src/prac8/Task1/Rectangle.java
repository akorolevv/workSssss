package prac8.Task1;
import java.awt.*;
import java.util.Random;
class Rectangle extends Shape
{
    protected int width;
    protected int height;

    public Rectangle()
    {
        super();
        Random random = new Random();
        this.width = random.nextInt(100) + 20; // Ширина от 20 до 119
        this.height = random.nextInt(100) + 20; // Высота от 20 до 119
    }

    public Rectangle(Color color, int x, int y, int weight, int height)
    {
        super(color, x, y);
        this.width = weight;
        this.height = height;
    }


    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }

}
