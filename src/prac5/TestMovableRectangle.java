package prac5;

public class TestMovableRectangle
{
    public static void main(String[] args)
    {
        MovableRectangle testobject = new MovableRectangle(10,15,20,25,13,17);
        System.out.println(testobject);

        testobject.moveDown(); // Попробуем двинуться вниз. Для первой точки: 15 - 17 = -2; для второй точки: 25 - 17 = 8
        System.out.println(testobject);

        testobject.moveRight(); // 1 точка: x1 = 10 + 13 = 23; ч2 = 20 + 13 = 33
        System.out.println(testobject);

        testobject.moveUp(); // 1 точка: -2 + 17 = 15; 2 точка: 8 + 17 = 25;
        System.out.println(testobject);

        testobject.moveLeft(); // 1 точка: х1 должен быть равен 10, 2 точка х2 должен быть равен 20
        System.out.println(testobject);

        testobject.setSpeedForTopLeft(100, 200); // Теперь мы изменяем скорость верхней левой точки
        testobject.moveUp(); // Пробуем передвинуться
        System.out.println(testobject);
    }
}
