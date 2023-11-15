package prac6.Dogs;

public class Bulldog extends Dog
{
    public Bulldog(String name, int age)
    {
        super(name, age);
    }

    public Bulldog()
    {
        super();
    }
    @Override
    public void bark()
    {
        System.out.println("Бульдог по имени " + getName() + " гавкает");
    }

    @Override
    public String toString()
    {
        return "Dog | Bulldog; Name: " + this.name + ";" + " Age: " + this.age + ";";
    }
}
