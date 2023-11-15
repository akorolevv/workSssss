package prac18.Task1to3;

public class test
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        MyClass<Integer, Animal, String> obj = new MyClass<>(42 , animal, "Hello");

        // Выводим значения переменных
        System.out.println("T: " + obj.getT());
        System.out.println("V: " + obj.getV());
        System.out.println("K: " + obj.getK());
        obj.printTypeNames();

    }
}

