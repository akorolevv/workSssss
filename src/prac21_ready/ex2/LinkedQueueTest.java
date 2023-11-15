package prac21_ready.ex2;


public class LinkedQueueTest
{
    public static void main(String[] args)
    {
        LinkedQueue queue = new LinkedQueue();

        // Тестирование первого метода - enqueue
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Длина очереди: " + queue.size()); // 3
        System.out.println("-----------------------------------");
        // Второй метод - dequeue
        System.out.println("Элементы в очереди:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Длина очереди: " + queue.size());
        System.out.println("-----------------------------------");
        // Тестирование третьего - метода isEmpty
        System.out.println("Очередь пуста? " + queue.isEmpty());
        System.out.println("-----------------------------------");

        // Тестирование метода clear
        queue.enqueue(222);
        queue.enqueue(333);
        System.out.println("Длина перед очисткой очереди: " + queue.size());
        System.out.println("Очередь очищена? " + queue.clear());
        System.out.println("Длина очереди после очистки: " + queue.size());


    }


}

