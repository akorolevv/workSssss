package prac24_ready;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder implements Order {

    private final List<Item> items;

    public RestaurantOrder() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean addItem(Item item) {
        return items.add(item);
    }

    @Override
    public boolean remove(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(itemName)) {
                items.remove(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity() {
        return items.size();
    }

    @Override
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    @Override
    public double costTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] itemsNames() {
        List<String> names = new ArrayList<>();
        for (Item item : items) {
            names.add(item.getName());
        }
        return names.toArray(new String[0]);
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        items.sort((item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return items.toArray(new Item[0]);
    }


}
