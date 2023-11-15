package prac1;

public class TestDog
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog(); //
        Dog dog2 = new Dog("Jacky", "Bulldog");
        System.out.println("Первая собака: ");
        System.out.println(dog1);
        dog1.setName("Charly"); // Переименуем первую собаку: был Johny, станет Charly
        System.out.println(dog1);

        System.out.println("Вторая собака: ");
        System.out.println(dog2);
        dog2.setAge(5); // Изменим возраст второй собаки, был 0, станет 5
        dog2.setWeight(7.8f); // Изменим вес второй собаки, был 0, станет 7.8
        System.out.println(dog2);

    }
}
