package prac14;
// UnfairWaitList - можно удалить элемент, который не является первым в очереди и он не может вернуться обратно
public class UnfairWaitList<E> extends WaitList<E>
{

    public UnfairWaitList() // Создаёт пустую очередь ожидания
    {
        super();
    }


    // Удаляет первое вхождение element из очереди
    public void remove (E element)
    {
        boolean removed = false;
        for(int i = 0; i < components.size(); i++)
        {
            E el = components.remove();
            if(!removed && el.equals(element))
            {
                removed = true;
            }
            else
            {
                components.add(el); // Если элемент не соответствует element или он был удален ранее, мы добавляем элемент el обратно в очередь с помощью components.add(el).
                // Это позволяет сохранить порядок элементов, которые мы не удаляем, поскольку мы извлекаем элементы ранее с помощью .remove
            }
        }
        if(removed) // Условие, чтобы последний элемент не стал первым
        {
            components.add(components.remove());
        }
    }

    // Перемещение элемента в конец очереди (Только перемещение)
    public void moveToBack(E element)
    {
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize)
        {
            components.add(element);
        }

    }
}
