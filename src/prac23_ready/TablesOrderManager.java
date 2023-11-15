package prac23_ready;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager
{
    // Ключ - int, значение - order
    private Map<Integer, Order> orders;

    public TablesOrderManager() {
        this.orders = new HashMap<>();
    }

    // Добавление заказа к номеру стола
    public void add(Order order, int tableNumber) {
        orders.put(tableNumber, order);
    }

    // Возвращает заказ для указанного столика по его номеру
    public Order getOrder(int tableNumber)
    {
        return orders.get(tableNumber);
    }


    // Добавние блюда у казанному номеру стола
    public void addDish(Dish dish, int tableNumber) {
        Order order = orders.get(tableNumber);
        if (order != null) {
            order.add(dish);
        }
    }

    // Удаление заказа для указанного номера стола
    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    // Количество свободных столов
    public int freeTableNumbers() {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (!orders.containsKey(i)) {
                count++;
            }
        }
        return count;
    }

    // Массив свободных столов
    public int[] freeTableNumbersArray() {
        int[] freeTables = new int[freeTableNumbers()];
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            if (!orders.containsKey(i)) {
                freeTables[index] = i;
                index++;
            }
        }
        return freeTables;
    }

    // Массив заказов
    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }


    // Общая стоимость всех заказов
    public double ordersCostSummary() {
        double sum = 0;
        for (Order order : orders.values()) {
            sum += order.costTotal();
        }
        return sum;
    }


    // возвращает количество блюд с определенным именем во всех заказах.
    public int dishQuantity(String dishName) {
        int count = 0;
        for (Order order : orders.values()) {
            count += order.itemQuantity(dishName);
        }
        return count;
    }
}
