package prac9.Task2;

public class Mouse implements Priceable
{
    protected int dpi;
    protected String color;
    protected double price;

    public Mouse(double price, int dpi, String color)
    {
        this.price = price;
        this.dpi = dpi;
        this.color = color;
    }

    public int getDpi()
    {
        return dpi;
    }

    public void setDpi(int dpi)
    {
        this.dpi = dpi;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Mouse | Color: " + this.color + "; Price: " + getPrice() + "; Dpi: " + this.dpi + ";";
    }
    @Override
    public double getPrice()
    {
        return price;
    }
}
