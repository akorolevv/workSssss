package prac7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FootballMatchSimulator extends JFrame
{
    private int milanScore = 0; // для хранения счета Милана
    private int madridScore = 0; // для хранения счета Мадрида
    private JLabel resultLabel; // Метка для отображения текущего счета
    private JLabel lastScorerLabel; // Метка для отображения последней забившей команды
    private JLabel winnerLabel; // Метка для отображения победителя

    public FootballMatchSimulator()
    {
        setTitle("Football Match"); // Заголовок окна
        setLayout(new GridLayout(6, 1)); // Установка сетки для размещения компонентов в окне

        // Создание двух кнопок
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        // Создание  меток
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");


        milanButton.addActionListener(new ActionListener() // Добавляем слушателя для возможности считывания действия
        {
            @Override
            public void actionPerformed(ActionEvent e)  // ActionEvent - класс представляющий событие (нажатие кнопки), e - переменная с информацией о событии)
            {
                milanScore++; // Увеличение счета Милана
                updateScore(); // Обновление отображения счета и победителя
                lastScorerLabel.setText("Last Scorer: AC Milan"); // Установка текста о последнем забившем
            }
        });

        madridButton.addActionListener(new ActionListener() // Добавляем возможность считывать действия
        {
            @Override
            public void actionPerformed(ActionEvent e) // ActionEvent - класс представляющий событие (нажатие кнопки), e - переменная с информацией о событии)
            {
                madridScore++; // Увеличение счета Мадрида
                updateScore(); // Обновление отображения счета и победителя
                lastScorerLabel.setText("Last Scorer: Real Madrid"); // Установка текста о последнем забившем
            }
        });

        add(milanButton); // Добавление кнопки Милана в окно
        add(madridButton); // Добавление кнопки Мадрида в окно
        add(resultLabel); // Добавление метки для отображения счета в окно
        add(lastScorerLabel); // Добавление метки для отображения последнего забившего в окно
        add(winnerLabel); // Добавление метки для отображения победителя в окно

        pack(); // Автоматический расчет размера окна на основе содержимого
        setLocationRelativeTo(null); // Размещение окна по центру экрана
        setVisible(true); // Отображение окна
    }

    private void updateScore()
    {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore); // Обновление отображения счета
        if (milanScore > madridScore)
        {
            winnerLabel.setText("Winner: AC Milan"); // Установка текста о победителе
        }
        else if (milanScore < madridScore)
        {
            winnerLabel.setText("Winner: Real Madrid"); // Установка текста о победителе
        }
        else
        {
            winnerLabel.setText("Winner: DRAW"); // Установка текста о победителе
        }
    }

    public static void main(String[] args)
    {
        new FootballMatchSimulator();

    }
}


