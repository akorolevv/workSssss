package prac13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args)
    {
        try
        {
            // Открываем файл для чтения
            // BufferedReader в качестве аргумента должен передавать объект класса FileReader
            // BufferReader используем для того, чтобы целиком читать строки

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\812m\\IdeaProjects\\newproject\\src\\input.txt"));
            String line; // Объявляем переменную для хранения текущей строки

            // Читаем строки из файла и выводим их на экран
            // Проверка, не пустая ли строка
            // readLine считывает строку целиком
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            // Закрываем файл
            reader.close();
        }
        catch (IOException e)
        {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

