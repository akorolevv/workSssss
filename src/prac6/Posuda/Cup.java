package prac6.Posuda;

public class Cup extends Dish
{
    private boolean handle; // Есть ручка или нет

    public Cup(String material, double weight, boolean handle)
    {
        super(material, weight);
        this.handle = handle;
    }

    public Cup()
    {
        super();
        this.material = "Plastic";
        this.weight = 200;
    }

    @Override
    public void use()
    {
        System.out.println("Это кружка. Налейте напиток и начните пить.");
    }

    @Override
    public String toString()
    {
        return "Dish: Cup  | Handle: " + this.handle + ";" + " Material: " + this.material + ";" + " Weight: " + this.weight + ";";
    }

    // Геттер и сеттер для наличия ручки
    public boolean hasHandle()
    {
        return handle;
    }

    public void setHandle(boolean handle)
    {
        this.handle = handle;
    }
}
