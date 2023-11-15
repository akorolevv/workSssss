package prac6.Mebel;
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop
{
    protected List<Furniture> inventory;

    public FurnitureShop()
    {
        inventory = new ArrayList<>();
    }


    // Метод для добавления мебели в инвентарь магазина
    // Furniture - это тип данных переменной, а furniture - имя переменной.
    // переменная furniture может хранить ссылку на объект, который является экземпляром класса Furniture или его подкласса.

    public void addFurniture(Furniture furniture)
    {
        inventory.add(furniture);
    }

    // Метод для вывода всей мебели в магазине
    public void listInventory()
    {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : inventory) // furniture ссылается на каждый элемент из списка "inventory"
        {
            System.out.println(furniture.describe());
        }
    }

    public static void main(String[] args)
    {
        FurnitureShop shop = new FurnitureShop();

        // Создание разных видов мебели и добавление их в магазин
        Table table1 = new Table("Деревянный стол", 150.0, 4);
        Chair chair1 = new Chair("Кожаный стул", 80.0, 4);
        Table table2 = new Table("Стеклянный стол", 200.0, 6);

        shop.addFurniture(table1);
        shop.addFurniture(chair1);
        shop.addFurniture(table2);

        // Вывод инвентаря магазина
        shop.listInventory();
    }
}