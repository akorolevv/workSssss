package prac6.Mebel;

// Класс для представления столов
public class Table extends Furniture
{
    private int length;
    public Table(String materials, double price, int length)
    {
        super(materials, price);
        this.length = length;
    }
    public Table()
    {
        super();
        this.length = 10;
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
    @Override
    public String describe()
    {
        return "Это стол и его высота равна " + this.length;
    }

    @Override
    public String toString()
    {
        return "Furniture: Table | Materials: " + this.materials + ";" + " Price: " + this.price + ";" + " Length: " + this.length + ";";
    }

}