package prac22_ready.task1;

public class Main {
    public static void main(String[] args)
    {
        // Создание объекта ConcreteFactory и присвоение его ComplexAbstractFactory
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создание комплексных чисел с помощью методов createComplex
        Complex complex1 = factory.createComplex(3, 4);
        Complex complex2 = factory.createComplex();
        // (!) Реализация создания объектов через интерфейс - абстрактная фабрика

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);
    }
}
