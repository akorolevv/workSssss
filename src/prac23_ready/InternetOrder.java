package prac23_ready;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder
{
    private List<Item> itemList;

    public InternetOrder(Item[] items)
    {
        this.itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item);
        }
    }

    //  добавляет элемент в заказ.
    public boolean addItem(Item item) {
        return itemList.add(item);
    }

    // удаляет элемент из заказа по имени.
    public boolean remove(String itemName) {
        boolean removed = false;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                itemList.remove(item);
                removed = true;
                break;
            }
        }
        return removed;
    }

    // удаляет все элементы с указанным именем из заказа.
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = itemList.size() - 1; i >= 0; i--) {
            if (itemList.get(i).getName().equals(itemName)) {
                itemList.remove(i);
                count++;
            }
        }
        return count;
    }

    //  возвращает количество элементов в заказе
    public int itemsQuantity() {
        return itemList.size();
    }

    // возвращает массив элементов заказа
    public Item[] getItems() {
        return itemList.toArray(new Item[0]);
    }

    // вычисляет общую стоимость всех элементов в заказе
    public double costTotal() {
        double total = 0;
        for (Item item : itemList) {
            total += item.getCost();
        }
        return total;
    }

    // возвращает количество элементов с указанным именем в заказе.
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    //  возвращает массив строк с названиями всех элементов в заказе.
    public String[] itemsNames() {
        List<String> names = new ArrayList<>();
        for (Item item : itemList) {
            names.add(item.getName());
        }
        return names.toArray(new String[0]);
    }

    // сортирует элементы по убыванию стоимости и возвращает отсортированный массив элементов.
    public Item[] sortedItemsByCostDesc() {
        itemList.sort((item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return itemList.toArray(new Item[0]);
    }
}


