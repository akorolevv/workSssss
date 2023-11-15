package prac21_ready.ex1;


// ArrayQueue: Этот класс представляет собой оболочку над ArrayQueueModule.
// Он предоставляет интерфейс для доступа к методам очереди, скрывая детали реализации от пользователя.
// Этот класс также предоставляет те же методы, что и ArrayQueueModule, но они являются экземплярными методами, а не статическими.
// В классе ArrayQueue методы не статические, потому что он используется для создания экземпляра ArrayQueueModule

public class ArrayQueue
{
    private ArrayQueueModule queue;

    // (Неявная передача)
    public ArrayQueue() // Инициализация поля queue с использованием статического метода getInstance() класса ArrayQueueModule
    {
        // Экземпляр ArrayQueueModule создаётся внутри конструктора
        this.queue = ArrayQueueModule.getInstance();
    }

    // Предусловие: size > 0
    // Постусловие: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    public Object dequeue()
    {
        return queue.dequeue();
    }

    // Предусловие:  size > 0
    // Постусловие: R = queue[head]
    //       queue - immutable
    public Object element() {
        return queue.element();
    }

    // Предусловие:  None
    // Постусловие: queue[tail] = element
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
