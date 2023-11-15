package prac9.Task1;

public class TestNameable
{
    public static void main(String[] args)
    {
        Nameable obj1 = new Dog("Ben", "Husky", 4);
        System.out.println(obj1.getName());
        Nameable obj2 = new Car("Ferrari", "Red");
        System.out.println(obj2.getName());

        System.out.println(obj1);
        System.out.println(obj2);

    }
}
