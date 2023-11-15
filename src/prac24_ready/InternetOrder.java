package prac24_ready;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order
{
    private List<Item> itemList;

    public InternetOrder(Item[] items) {
        this.itemList = new ArrayList<>();
        for (Item item : items) {
            itemList.add(item);
        }
    }

    public boolean addItem(Item item) {
        return itemList.add(item);
    }

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

    public int itemsQuantity() {
        return itemList.size();
    }

    public Item[] getItems() {
        return itemList.toArray(new Item[0]);
    }

    public double costTotal() {
        double total = 0;
        for (Item item : itemList) {
            total += item.getCost();
        }
        return total;
    }

    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    public String[] itemsNames() {
        List<String> names = new ArrayList<>();
        for (Item item : itemList) {
            names.add(item.getName());
        }
        return names.toArray(new String[0]);
    }

    public Item[] sortedItemsByCostDesc() {
        itemList.sort((item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return itemList.toArray(new Item[0]);
    }
}
