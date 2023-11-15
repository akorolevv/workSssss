package prac21_ready.ex1;
// ArrayQueueADT: Это класс, который также представляет собой оболочку над ArrayQueueModule, но в виде абстрактного типа данных (ADT).
// В этом случае ссылка на экземпляр ArrayQueueModule передается явно.

public class ArrayQueueADT
{

    private ArrayQueueModule queue;

    // Экземпляр ArrayQueueModule передаётся в конструктор (явная передача)
    public ArrayQueueADT(ArrayQueueModule queue)
    {
        this.queue = queue;
    }

    // Предусловие: size > 0
    // Постусловие: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    // удалить и вернуть первый элемент в очереди
    public Object dequeue()
    {
        return queue.dequeue();
    }

    // Предусловие:  size > 0
    // Постусловие: R = queue[head]
    //       queue - immutable
    public Object element()
    {
        return queue.element();
    }

    // Предусловие:  None
    // POST: queue[tail] = element
    //       queue[head]..queue[tail-1] - immutable
    public void enqueue(Object o) {
        queue.enqueue(o);
    }

    // Предусловие:  None
    // Постусловие: queue - immutable
    //       R = (head == tale)
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Предусловие:  None
    // Постусловие: size == 0
    public boolean clear() {
        return queue.clear();
    }
    public int size()
    {
        return queue.size();
    }
}
