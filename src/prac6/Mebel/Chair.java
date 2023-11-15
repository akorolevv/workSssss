package prac6.Mebel;

public class Chair extends Furniture
{
    protected int number_of_legs;

    public Chair(String material, double price, int number_of_legs)
    {
        super(material, price);
        this.number_of_legs = number_of_legs;
    }

    @Override
    public String describe()
    {
        return "Это стул и его количество ножек равно " + this.number_of_legs;
    }

    public int getNumber_of_legs()
    {
        return this.number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs)
    {
        this.number_of_legs = number_of_legs;
    }
    @Override
    public String toString()
    {
        return "Furniture: Chair | Materials: " + this.materials + ";" + " Price: " + this.price + ";" + " Number of legs: " + this.number_of_legs + ";";
    }

}
