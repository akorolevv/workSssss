package prac6.Mebel;

public abstract class Furniture
{
    protected String materials;
    protected double price;

    public Furniture(String materials, double price)
    {
        this.materials = materials;
        this.price = price;
    }
    public Furniture()
    {
        this.materials = "Wood";
        this.price = 2000.0;
    }


    // Абстрактный метод для описания характеристик мебели
    public abstract String describe();

    // Геттеры и сеттеры для свойств
    public String getMaterials()
    {
        return materials;
    }

    public void setMaterials(String name)
    {
        this.materials = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
