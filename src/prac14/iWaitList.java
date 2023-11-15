package prac14;
import java.util.Collection;
// E - обозначение типа элементов, т.е. если в дальнейшем список будет для целых чисел, будет iWaitList<Integer>
public interface iWaitList <E>
{
    // Список ожидания - очередь из элементов, каждый элемент ожидает выполнения определённого действия или условия
    // Метод добавления элемента в список ожидания
    void add(E element);

    // Метод удаления элемента и его возвращения
    E remove();

    // Метод проверки, содержит ли список ожидания элемент element, вернёт true если да и false, если нет
    boolean contains(E element);

    // Метод проверки, содержатся ли все элементы из коллекции collction в списке ожидания
    boolean containsAll(Collection<E> collection);

    // Метод проверки, пустой ли список ожидания
    boolean isEmpty();
}
