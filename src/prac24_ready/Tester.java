package prac24_ready;

public class Tester
{
    public static void main(String[] args) {
        // Тестирование OrderManager + исключений
        OrderManager orderManager = new OrderManager();
        System.out.println("-----------------------------------------");
        System.out.println("Проверка первого исключения (OrderAlreadyAddedException) на то, что столик уже занят");
        System.out.println("Добавим заказ на столик");
        // Добавление заказа по номеру столика
        try {
            Order order1 = new RestaurantOrder();
            orderManager.add(order1, 1);
            System.out.println("Заказ успешно добавлен.");
        } catch (OrderAlreadyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");
        // Попытка добавить заказ на уже занятый столик
        System.out.println("Попытка добавить заказ на уже занятый столик:");
        try
        {
            Order order2 = new RestaurantOrder();
            orderManager.add(order2, 1);
            System.out.println("Заказ успешно добавлен.");
        } catch (OrderAlreadyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");
        System.out.println("Проверка второго искоючения (IllegalTableNumber)");
        System.out.println("Получение заказа по несуществующему номеру столика: ");

        try {
            Order retrievedOrder = orderManager.getOrder(2);
            if (retrievedOrder != null) {
                System.out.println("Полученный заказ: " + retrievedOrder.toString());
            }
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------");
        System.out.println("Тестирование InternetOrder");
        // Тестирование класса InternetOrder
        Item item1 = new Dish(200, "Пицца", "Вкусная");
        Item item2 = new Dish(100, "Суп", "Горячий и ароматный");
        Item[] items = {item1, item2};
        InternetOrder internetOrder = new InternetOrder(items);

        System.out.println("Цена интернет-заказа: " + internetOrder.costTotal());
        System.out.println("Число элеменвто заказа: " + internetOrder.itemsQuantity());
        System.out.println("-----------------------------------------");
        System.out.println("Тестирование RestaurantOrder:");

        // Тестирование класса RestaurantOrder
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(item1);
        restaurantOrder.addItem(item2);
        System.out.println("Цена заказа: " + restaurantOrder.costTotal());
        System.out.println("Количество блюд с названием 'суп': " + restaurantOrder.itemQuantity("Суп"));
    }
}


