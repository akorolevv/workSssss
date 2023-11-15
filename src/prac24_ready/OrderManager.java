package prac24_ready;

import java.util.HashMap;
import java.util.Map;

public class OrderManager
{
    private Map<Integer, Order> orders;
    private Map<String, Order> addressOrders; // Добавленное поле

    public OrderManager() {
        this.orders = new HashMap<>();
        this.addressOrders = new HashMap<>(); // Инициализация нового поля
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyException
    {
        if (orders.containsKey(tableNumber))
        {
            throw new OrderAlreadyException(tableNumber);
        }
        orders.put(tableNumber, order);
    }

    // Перегрузка метода добавления заказа
    public void add(String address, Order order) {
        addressOrders.put(address, order);
    }

    public Order getOrder(int tableNumber)
    {
        if (!orders.containsKey(tableNumber)) {
            throw new IllegalTableNumber(tableNumber);
        }
        return orders.get(tableNumber);
    }

    // Перегрузка метода получения заказа
    public Order getOrder(String address) {
        return addressOrders.get(address);
    }

    public void addDish(Dish dish, int tableNumber) throws OrderAlreadyException
    {
        if (orders.containsKey(tableNumber))
        {
            throw new OrderAlreadyException(tableNumber);
        }
        Order order = orders.get(tableNumber);
        if (order != null)
        {
            order.addItem(dish);
        }
    }

    // Перегрузка метода добавления позиции к заказу
    public void addDish(String address, Item item) {
        Order order = addressOrders.get(address);
        if (order != null)
        {
            order.addItem(item);
        }
    }

    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    // Перегрузка метода удаления заказа
    public void removeOrder(String address) {
        addressOrders.remove(address);
    }

    public int freeTableNumbers() {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (!orders.containsKey(i)) {
                count++;
            }
        }
        return count;
    }

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

    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }

    // Возвращает массив имеющихся на данный момент заказов по адресам
    public Order[] getAddressOrders() {
        return addressOrders.values().toArray(new Order[0]);
    }

    // Возвращает суммарную сумму имеющихся на данный момент заказов по адресам
    public double addressOrdersCostSummary() {
        double sum = 0;
        for (Order order : addressOrders.values()) {
            sum += order.costTotal();
        }
        return sum;
    }

    // Возвращает общее среди всех заказов количество заказанных порций заданного блюда по его имени
    public int dishQuantity(String dishName) {
        int count = 0;
        for (Order order : orders.values()) {
            count += order.itemQuantity(dishName);
        }
        for (Order order : addressOrders.values()) {
            count += order.itemQuantity(dishName);
        }
        return count;
    }
}
