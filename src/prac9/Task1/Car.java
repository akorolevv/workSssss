package prac9.Task1;

public class Car implements Nameable
{
    protected String name;
    protected String color;

    public Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return this.color;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "Car | Model mame: " + getName() + "; Color: " + this.color + ";";
    }
}
