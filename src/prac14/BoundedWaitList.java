package prac14;

import java.util.Collection;

// BoundedWaitList - список ожидания с ограниченной ёмкостью, ёмкость указывается в момент создания.
public class BoundedWaitList <E> extends WaitList<E>
{
    private int capacity; // Максимальная ёмкость
    public BoundedWaitList(int capacity) // создание очереди с ёмкостью
            // ёмкость равно 0 --> исключение
    {
        super();
        if(capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }
    public BoundedWaitList(Collection<E> col) // создание очереди с элементами коллекции
    {
        super(col);
        this.capacity = col.size();
    }
    public int getCapacity() // геттер для ёмкости
    {
        return capacity;
    }

    @Override // метод add необходимо переписать, поскольку если очередь заполнена, в неё невозможно добавить элемент
    public void add(E element)
    {
        if(components.size() == capacity) throw new IllegalStateException("Очередь заполнена!");
        components.add(element);
    }

    @Override
    public String toString()
    {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", components=" + components +
                '}';
    }
}
