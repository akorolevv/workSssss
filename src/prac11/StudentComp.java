package prac11;

import java.util.Comparator;

public class StudentComp implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    // Метод compare принимает два объекта (o1 и o2) для сравнения.
    {
        if(!(o1 instanceof Student && o2 instanceof Student))
            // Проверка, являются ли оба объекта типа Student.
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return ((Student) o2).getGPA() - ((Student) o1).getGPA();
        // Сравниваем объекты Student по их среднему баллу (GPA).
        // Возвращаем разницу между средними баллами.
        // Если o1.GPA < o2.GPA, возвращается отрицательное число.
        // Если o1.GPA > o2.GPA, возвращается положительное число.
        // Если они равны, возвращается 0.

    }
}
