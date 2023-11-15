package prac6.Posuda;

// Абстрактный класс, описывающий посуду
public abstract class Dish
{
    protected String material;
    protected double weight;

    public Dish(String material, double weight)
    {
        this.material = material;
        this.weight = weight;
    }
    public Dish()
    {
        this.material = "Ceramics";
        this.weight = 200;
    }
    public abstract void use();

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

}
