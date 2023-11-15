package prac14;

import java.util.ArrayList;

public class main
{

    public static void main(String[] args)
    {
        // Тестирование класса WaitList
        System.out.println("Тестирование WaitList:");
        WaitList<String> wl = new WaitList<>();
        wl.add("Объект1");
        wl.add("Объект2");
        wl.add("Объект3");
        System.out.println("Исходный WaitList: " + wl);
        System.out.println("Удаленный элемент: " + wl.remove());
        System.out.println("Обновленный WaitList: " + wl);
        System.out.println("Пуст ли WaitList? " + wl.isEmpty());
        System.out.println("Содержит ли WaitList 'Объект1'? " + wl.contains("Объект1"));

        ArrayList<String> al = new ArrayList<>();
        al.add("О2");
        al.add("О3");
        System.out.println("Содержит ли WaitList все элементы из ArrayList? " + wl.containsAll(al));
        System.out.println();

        // Тестирование класса BoundedWaitList
        System.out.println("Тестирование BoundedWaitList:");
        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("obj1");
        bwl.add("obj2");
        bwl.add("obj3");
        System.out.println("Исходный BoundedWaitList: " + bwl);
        try
        {
            bwl.add("obj4"); // Попытка добавить элемент, когда список заполнен
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Обновленный BoundedWaitList: " + bwl);
        System.out.println("Емкость BoundedWaitList: " + bwl.getCapacity());
        System.out.println();




        // Тестирование класса UnfairWaitList
        System.out.println("Тестирование UnfairWaitList:");
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(5);
        uwl.add(23);
        uwl.add(7);
        uwl.add(5);
        uwl.add(6);
        System.out.println("Исходный UnfairWaitList: " + uwl);
        uwl.remove(5); // Удаление первого вхождения числа 5
        System.out.println("UnfairWaitList после удаления первого вхождения числа 5: " + uwl);
        uwl.moveToBack(23); // Перемещение числа 23 в конец
        System.out.println("UnfairWaitList после перемещения числа 23 в конец: " + uwl);
    }
}
