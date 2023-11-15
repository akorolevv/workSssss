package prac13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChangeTextPlusEnd
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Введите текст для добавления в файл: ");
            String newText = scanner.nextLine();

            // Открываем файл для дозаписи (если файл не существует, он будет создан)
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\812m\\IdeaProjects\\newproject\\src\\inputtask4.txt", true));

            // Записываем новый текст в конец файла
            writer.write(newText);
            // write работает по другому из за нового аргумента

            writer.newLine(); // Добавляем перевод строки между старым и новым текстом

            // Закрываем файл
            writer.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close(); // Закрываем Scanner
        }
    }
}

