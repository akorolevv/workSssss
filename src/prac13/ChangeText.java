package prac13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChangeText
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Введите новую информацию для записи в файл: ");
            String newContent = scanner.nextLine();

            // Открываем файл для записи (существующий файл будет перезаписан)
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\812m\\IdeaProjects\\newproject\\src\\inputtask3.txt"));

            // Записываем новую информацию в файл
            writer.write(newContent);

            // Закрываем файл
            writer.close();
            System.out.println("Новая информация успешно записана в файл.");
        }
        catch (IOException e)
        {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
        finally
        {
            scanner.close(); // Закрываем Scanner
        }
    }
}

