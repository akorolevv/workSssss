package prac13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileFromKeyboard
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для записи в файл: ");
        String inputText = scanner.nextLine(); // Считываем текст с клавиатуры

        try
        {

            FileWriter writer = new FileWriter("filefortask1.txt");
            writer.write(inputText);
            writer.close();
            System.out.println("Текст успешно записан в файл.");
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
