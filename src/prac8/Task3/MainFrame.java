package prac8.Task3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame
{

    private JLabel imgLabel; // Объявление JLabel для отображения изображений
    private int imgNum = 1; // Переменная для хранения номера текущего изображения

    private MainFrame() // Настраивается размер окна и создаётся JLabel с стартовым изображением
    {
        this.setSize(666, 666); // Установка размеров окна

        // Создание JLabel с изображением "1.jpg" и центрированием
        // "" - текст, который будет отображаться

        // new ImageIcon(getClass().getResource("1.jpg"))
        // Это конструктор класса ImageIcon, который создает объект ImageIcon на основе изображения загруженного из файла "1.jpg".
        // Для этого используется метод getClass().getResource("1.jpg"), который ищет файл "1.jpg" внутри пакета, в котором находится класс MainFrame.

        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        // Добавление JLabel на панель контента окна
        getContentPane().add(imgLabel);


        // Создание и запуск таймера для переключения изображений каждую секунду
        Timer timer = new Timer(1000, e -> nextImg());
        timer.start();
    }

    // Метод для переключения на следующее изображение
    // Увеличивается номер картинки + приписывается jpg -- так формируется строка новой картинки
    private void nextImg()
    {
        // Установка нового изображения в JLabel на основе imgNum
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpg")));
        if(imgNum == 3) imgNum = 0; // Если достигнут последний номер изображения, перейти на первое

    }

    public static void main(String[] args)
    {
        MainFrame mf = new MainFrame(); // Создание объекта класса MainFrame
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Завершение приложения при закрытии окна
        mf.setVisible(true); // Сделать окно видимым

    }
}