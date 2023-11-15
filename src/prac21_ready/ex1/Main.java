package prac21_ready.ex1;


public class Main
{
    public static void main(String[] args)
    {
        testArrayQueueModule();
        testArrayQueue();
        testArrayQueueADT();
    }

    private static void testArrayQueueModule()
    {
        ArrayQueueModule queue = ArrayQueueModule.getInstance();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("ArrayQueueModule Size: " + queue.size()); // ожидаем 2
        System.out.println("ArrayQueueModule Element: " + queue.element()); // ожидаем 1
        System.out.println("ArrayQueueModule Dequeue: " + queue.dequeue()); // ожидаем 1
        System.out.println("ArrayQueueModule Is Empty: " + queue.isEmpty()); // ожидаем false
        queue.clear();
        System.out.println("ArrayQueueModule Is Empty After Clear: " + queue.isEmpty()); // ожидаем true
        System.out.println("----------------------------------------------------");
    }

    private static void testArrayQueue()
    {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("ArrayQueue Size: " + queue.size()); // ожидаем 2
        System.out.println("ArrayQueue Element: " + queue.element()); // ожидаем 3
        System.out.println("ArrayQueue Dequeue: " + queue.dequeue()); // ожидаем 3
        System.out.println("ArrayQueue Is Empty: " + queue.isEmpty()); // ожидаем false
        queue.clear();
        System.out.println("ArrayQueue Is Empty After Clear: " + queue.isEmpty()); // ожидаем true
        System.out.println("----------------------------------------------------");
    }

    private static void testArrayQueueADT()
    {
        ArrayQueueModule queueModule = ArrayQueueModule.getInstance();
        ArrayQueueADT queueADT = new ArrayQueueADT(queueModule);
        queueADT.enqueue(5);
        queueADT.enqueue(6);
        System.out.println("ArrayQueueADT Size: " + queueADT.size()); // ожидаем 2
        System.out.println("ArrayQueueADT Element: " + queueADT.element()); // ожидаем 5
        System.out.println("ArrayQueueADT Dequeue: " + queueADT.dequeue()); // ожидаем 5
        System.out.println("ArrayQueueADT Is Empty: " + queueADT.isEmpty()); // ожидаем false
        queueADT.clear();
        System.out.println("ArrayQueueADT Is Empty After Clear: " + queueADT.isEmpty()); // ожидаем true
    }
}

