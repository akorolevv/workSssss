package prac21_ready.ex2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue
{

    // Приватное поле q типа LinkedList для хранения элементов очереди
    private LinkedList<Object> q;


    // Конструктор, в котором происходит инициализация
    public LinkedQueue()
    {
        q = new LinkedList<>();
        head = tail = 0; // Инициализация начальных значений head и tail
        // head - индекс (или позиция) начала очереди. Он указывает на первый элемент в очереди.
        // tail - индекс (или позиция) конца очереди. Он указывает на следующую после последнего элемента позицию в очереди.
    }

    // Переопределяем каждый метод из абстрактного класса
    @Override
    public Object dequeue()
    {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!"); // Проверка на пустоту
        return  q.remove(head); // Удаление и возвращение элемента из начала очереди
    }

    @Override
    public Object element()
    {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!"); // Проверка на пустоту
        return  q.get(head);  // Возвращение элемента из начала очереди
    }

    @Override
    public void enqueue(Object o)
    {
        q.add(o); // Добавление элемента в конец очереди
        tail++; // Увеличение значения tail
    }

    @Override
    public boolean isEmpty()
    {
        if (q.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        // return tail == head; // Если пустая, значит два поля равны
    }

    @Override
    public boolean clear() {
        boolean r = ! isEmpty(); // Сохранение значения, показывающего была ли очередь пустой
        q.clear(); // Очистка списка
        head = tail = 0; // Сброс значений head и tail
        return r; // Возвращение значения о том, была ли очередь пустой до очистки
    }

    @Override
    public int size()
    {
        return q.size();
    }
}
