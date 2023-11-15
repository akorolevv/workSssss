package prac9.Task2;

public class Laptop implements Priceable
{
    protected String name_model;
    protected double price;

    public Laptop(double price, String model)
    {
        this.price = price;
        this.name_model = model;
    }

    public String getName_model()
    {
        return name_model;
    }

    public void setModel(String model)
    {
        this.name_model = name_model;
    }

    @Override
    public String toString()
    {
        return "Laptop | Name of Model: " + this.name_model + "; Price: " + getPrice() + ";";
    }

    @Override
    public double getPrice()
    {
        return price;
    }
}
