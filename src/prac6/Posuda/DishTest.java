package prac6.Posuda;

public class DishTest
{
    public static void main(String[] args)
    {
        // Создание объектов разных видов посуды
        Plate plate = new Plate("Ceramics", 0.5, 20);
        Cup cup = new Cup("Glass", 0.2, true);

        // Использование посуды
        plate.use();
        cup.use();

        // Вывод информации о посуде
        System.out.println(plate);
        System.out.println(cup);

    }
}