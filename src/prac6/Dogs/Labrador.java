package prac6.Dogs;

public class Labrador extends Dog
{
    public Labrador(String name, int age)
    {
        super(name, age);
    }
    public Labrador()
    {
        super();
    }

    @Override
    public void bark()
    {
        System.out.println("Лабрадор по имени " + getName() + " гавкает");
    }
    @Override
    public String toString()
    {
        return "Dog | Labrador; Name: " + this.name + ";" + " Age: " + this.age + ";";
    }

}