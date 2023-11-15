package prac23_ready;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private final List<Item> items;

    public Order()
    {
        this.items = new ArrayList<>();
    }

    // Добавление элемента в заказ
    public void add(Item item)
    {
        items.add(item);
    }

    // Удаление элемента из заказа
    public boolean remove(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    // Количество элементов в заказе
    public int itemQuantity() {
        return items.size();
    }

    // Количество элементов в заказе по имени
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    // Возвращение массива элементов заказа
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    // Общая стоимость заказа
    public double costTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }
}
