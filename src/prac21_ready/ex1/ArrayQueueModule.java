package prac21_ready.ex1;
import prac21_ready.ex2.AbstractQueue;
// один экземпляр очередт с исп. переменных класса.

// ArrayQueueModule: Это класс, который реализует структуру данных "очередь" с помощью массива, используя переменные класса.
// Этот класс предоставляет один экземпляр очереди с использованием переменных класса.
// методы enqueue, dequeue, element, isEmpty и clear, являются статическими.
// методы не объявлены явно как статические, но так как для данного класса создается только один экземпляр,
// и доступ к этому единственному экземпляру осуществляется через метод getInstance(),



// Инвариант
// 1 - Размер очереди не может быть отрицательный
// 2 - Индекс головы и хвоста должен находиться в пределах массива (0 <= head, tail < length)
// 3 - Если tail == head, значит очередь либо пуста, либо заполнена
public class ArrayQueueModule extends AbstractQueue
{
    private Object[] q; // Объявление приватного массива объектов q

    // Поскольку в задании должен реализовываться один экземпляр очереди
    private static ArrayQueueModule instance;

    // Предусловие: queue - null (значит что ArrayQueueModule не был инициализирован)
    // Постусловие: queue.size = 0; q.length = 16; (Новая очередь создается с начальной емкостью 16, и оба указателя head и tail устанавливаются в 0.)
    private ArrayQueueModule()
    {
        // Создание массива объектов q заданной начальной емкости и инициализация head и tail значением 0
        q = new Object[START_CAPACITY];
        head = tail = 0;
    }


    // Предусловие: отсутствует
    // Постусловие: instance - Singleton; queue - immutable (Метод гарантирует, что созлаётся один экземпляр ArrayQueueModule, и что сама очередь остаётся неизменной)

    // Получение единственного экземпляра класса ArrayQueueModule
    public static ArrayQueueModule getInstance()
    {
        if(instance == null)
            instance = new ArrayQueueModule();
        return instance;
    }


    // Предусловие:  size > 0 (иначе удалять нечего)
    // Постусловие: R = queue[head]
    //       queue[head] = queue[head+1]
    //       queue[head+1]..queue[tail] - immutable
    // (Первый элемент удаляется и происходит сдвиг, элементы, начиная со второго и до tail - не меняются)
    @Override
    // Удаление элемента из начала очереди
    public Object dequeue()
    {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        // Сохраняем удаляемый элемент
        Object r = q[head++];
        // Если достигнут конец массива, обнуляем head
        if(head == q.length) head = 0;
        return r;
    }



    // Предусловие:  нету
    // Постусловие: queue - immutable, R = (head == tale)
    // (Очередь не меняется, возвращает истину/ложь)
    @Override
    public boolean isEmpty()
    {
        return head == tail;
    }



    // Предусловие: None
    // Постусловие: queue[tail] = element, queue[head]..queue[tail-1] - immutable
    // (queue[tail] = element - элемент поместился в конец очереди, queue[head]..queue[tail-1] - элементы от начала до нового tail неизменны)
    @Override
    // Добавление элемента в конец очереди
    public void enqueue(Object element)
    {
        q[tail++] = element; // Добавляем элемент в конец очереди
        if(tail == q.length) tail = 0; // Если достигнут конец массива, обнуляем tail
        if(tail == head) resize(q.length * 2); // Если очередь слишком заполнена, изменяем ее размер
    }


    // Предусловие: none;
    // Постусловие: q.length == nSize; queue - immutable;
    // (Размер равен новому размеру, очередь неизменна)
    // Изменение размера очереди
    private void resize(int nSize)
    {
        Object[] nq = new Object[nSize]; // Создание нового массива с новым размером
        // Копирование элементов из старого массива в новый
        System.arraycopy(q, head, nq, 0, Math.abs(head-tail));
        tail = Math.abs(head-tail); // Обновление значения tail
        head = 0; // Обнуление значения head
        q = nq; // Присваивание нового массива q
    }


    // Предусловие:  size > 0
    // Постусловие: R = queue[head], queue - immutable
    // (Возвращаем первый элемент, очередь неизменна)
    @Override
    // Извлечение элемента из начала очереди без удаления
    public Object element()
    {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    // Предусловие: None
    // Постусловие: size == 0, q.length = 16
    //
    @Override
    // Очистка очереди
    public boolean clear()
    {
        // Сохраняем информацию о том, были ли элементы в очереди
        boolean r = !isEmpty();
        head = tail = 0; // Обнуляем head и tail
        resize(START_CAPACITY); // Изменяем размер очереди на начальный
        return r; // Возвращаем информацию о наличии элементов в очереди перед очисткой
    }

    @Override
    public int size()
    {
        if (tail >= head)
        {
            return tail - head;
        }
        else
        {
            return q.length;
        }
    }

}
