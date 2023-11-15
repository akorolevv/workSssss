package prac8.Task1;
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        // Создание графического окна с заголовком "Рисование фигур"
        JFrame frame = new JFrame("Рисование фигур");

        // Установка размеров окна 400x400 пикселей
        frame.setSize(400, 400);

        // Установка операции закрытия окна при нажатии на крестик - завершение программы
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели, на которой будут отображаться фигуры
        JPanel panel = new JPanel()
        {
            @Override
            // Переопределение метода paintComponent для рисования на панели
            // В метод передаётся плоскость для рисования
            protected void paintComponent(Graphics g)
            {
                // Чтобы предыдущее содержимое панели не осталось видимым
                super.paintComponent(g);

                // Цикл для создания и отрисовки 20 случайных фигур
                for (int i = 0; i < 20; i++)
                {
                    // shape может хранить ссылку на Circle/Rectangle, т.к. это дочерние классы от Shape
                    Shape shape;
                    if (i % 2 == 0)
                    {
                        shape = new Circle();
                    } else
                    {
                        shape = new Rectangle();
                    }
                    shape.draw(g);
                }
            }
        };
        // Добавление панели на графическое окно
        frame.add(panel);

        // Отображение графического окна на экране
        frame.setVisible(true);
    }
}
