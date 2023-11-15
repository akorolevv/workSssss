package prac6.Posuda;

// Класс для представления тарелок
public class Plate extends Dish
{
    protected int diameter;

    public Plate(String material, double weight, int diameter)
    {
        super(material, weight);
        this.diameter = diameter;
    }
    public Plate()
    {
        super();
        this.diameter = 20;
    }
    @Override
    public void use()
    {
        System.out.println("Это тарелка. Положите на тарелку еду и начните есть.");
    }


    public int getDiameter()
    {
        return diameter;
    }

    public void setDiameter(int diameter)
    {
        this.diameter = diameter;
    }
    @Override
    public String toString()
    {
        return "Dish: Plate  |" + " Material: " + this.material + ";" + " Weight: " + this.weight + "; Diameter: " + this.diameter + ";";
    }
}