package prac18.Task1to3;
import java.io.Serializable;

// T extends Comparable<T> - параметр T должен быть типом или реализацией интерфейса Comparable (метод compareTo для сравнения объектов одного типа)
// V extends Animal & Serializable - параметр V является подтипом или сам класса Animal и должен реализовывать интерфейс Serializable
// K не имеет явных ограничений и может быть любого типа
class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K>
{
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k)
    {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT()
    {
        return t;
    }

    public V getV()
    {
        return v;
    }

    public K getK()
    {
        return k;
    }

    public void printTypeNames() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }
}