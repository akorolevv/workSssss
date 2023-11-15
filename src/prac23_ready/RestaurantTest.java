package prac23_ready;

import java.util.Arrays;

public class RestaurantTest {
    public static void main(String[] args) {
        // Тестирование класса Order
        System.out.println("Тестирование класса Order:");
        Order order = new Order();
        Dish dish1 = new Dish(15, "Паста", "Итальянское блюдо из макарон");
        Dish dish2 = new Dish(12, "Пицца", "Классическая Маргарита");
        Drink drink1 = new Drink(5, "Кола", "Классическая газировка");
        Drink drink2 = new Drink(8, "Апельсиновый сок", "Свежевыжатый апельсиновый сок");
        order.add(dish1);
        order.add(dish2);
        order.add(drink1);
        order.add(drink2);
        System.out.println("Общая стоимость заказа: " + order.costTotal());
        System.out.println("Количество позиций в заказе: " + order.itemQuantity());
        System.out.println("Удаление Пиццы: " + order.remove("Пицца"));
        System.out.println("Позиции в заказе: " + Arrays.toString(order.getItems()));
        System.out.println("Количество напитков Кола в заказе: " + order.itemQuantity("Кола"));
        System.out.println("Удаление Апельсинового сока: " + order.remove("Апельсиновый сок"));
        System.out.println("Позиции в заказе: " + Arrays.toString(order.getItems()));

        // Тестирование класса TablesOrderManager
        System.out.println("\nТестирование класса TablesOrderManager:");
        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        tablesOrderManager.add(order, 1);
        System.out.println("Свободные столики: " + tablesOrderManager.freeTableNumbers());
        System.out.println("Суммарная стоимость всех заказов: " + tablesOrderManager.ordersCostSummary());
        System.out.println("Количество блюд Паста во всех заказах: " + tablesOrderManager.dishQuantity("Паста"));

        // Тестирование класса InternetOrder
        System.out.println("\nТестирование класса InternetOrder:");
        Item[] items = {dish1, dish2, drink1, drink2};
        InternetOrder internetOrder = new InternetOrder(items);
        System.out.println("Количество позиций в интернет-заказе: " + internetOrder.itemsQuantity());
        System.out.println("Общая стоимость интернет-заказа: " + internetOrder.costTotal());
        System.out.println("Удаление всех блюд Паста из интернет-заказа: " + internetOrder.removeAll("Паста"));
        System.out.println("Позиции в интернет-заказе: " + Arrays.toString(internetOrder.getItems()));
        System.out.println("Наименования позиций в интернет-заказе: " + Arrays.toString(internetOrder.itemsNames()));
        System.out.println("Позиции в интернет-заказе, отсортированные по убыванию стоимости: " + Arrays.toString(internetOrder.sortedItemsByCostDesc()));
    }
}
