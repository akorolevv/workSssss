package prac8.Task2;
// C:\Users\812m\IdeaProjects\newproject\src\prac8_ready\Task2\images.jpeg
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage
{
    public static void main(String[] args)
    {
        // Проверяем, что в аргументах командной строки есть путь к картинке
        if (args.length != 1)
        {
            System.out.println("Пожалуйста, укажите путь к картинке в аргументах командной строки.");
            return;
        }

        // Получаем путь к файлу из аргументов
        String imagePath = args[0];

        // Загружаем картинку из файла
        BufferedImage image = loadImage(imagePath);

        if (image == null)
        {
            System.out.println("Не удалось загрузить изображение.");
            return;
        }

        // Создаем окно для отображения картинки
        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель для отображения картинки
        JPanel panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                // Отображаем изображение на панели
                g.drawImage(image, 0, 0, null);
            }
        };

        // Устанавливаем размер панели равным размеру изображения
        panel.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));

        // Добавляем панель на окно
        frame.add(panel);

        // Автоматически подстраиваем размер окна под размер изображения
        frame.pack();

        // Отображаем окно
        frame.setVisible(true);
    }

    // Метод для загрузки изображения из файла


    private static BufferedImage loadImage(String imagePath)
    {

        try
        {
            // ImageIO.read - метод загрузки изображения из файла.
            // Изображение мы передаём в объект класса File

            return ImageIO.read(new File(imagePath));
        }
        catch (IOException e)
        {
            return null;
        }
    }
}

