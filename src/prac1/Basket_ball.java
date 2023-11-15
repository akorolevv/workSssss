package prac1;

public class Basket_ball
{
    private int size; // Размер
    private String brand; // Бренд
    private String view; // Вид мяча

    public Basket_ball()
    {
        size = 5;
        brand = "Spalding";
        view = "outdoor";
    }
    public Basket_ball(int _size, String _brand, String _view)
    {
        size = _size;
        brand = _brand;
        view = _view;
    }

    // Методы установки различных значений
    public void setSize(int __size)
    {
        this.size = __size;
    }
    public void setBrand(String  __brand)
    {
        this.brand = __brand;
    }
    public void setView(String  __view)
    {
        this.view = __view;
    }

    // Методы возвращения различных значений

    public int getSize()
    {
        return size;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getView()
    {
        return view;
    }
    public String toString()
    {
        return "Brand: " + this.brand+ ";" + " Size: " + this.size + ";" + " View: " + this.view + ".";
    }

}
