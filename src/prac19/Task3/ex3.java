package prac19.Task3;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ex3
{
    public static void main(String[] args)
    {
        // Создание объекта File, представляющего каталог "D:\ideaJAVA"
        // Объект File - это класс в Java, предназначенный для работы с файлами и директориями в файловой системе
        // C:\Users\812m\Downloads\Новая папка (3)\
        // C:\Users\812m\IdeaProjects\newproject\src\

        File dir = new File("C:\\Users\\812m\\Downloads\\Новая папка (3)\\");

        // Получение массива файлов и подкаталогов в указанном каталоге
        // dir - это объект типа File, представляющий каталог (директорию) в файловой системе.
        // listFiles() - это метод класса File для получения массива объектов типа File, представляющих файлы и подкаталоги в данной директории.
        // массив arrFiles, который содержит объекты File, представляющие файлы и подкаталоги, находящиеся в указанной директории.

        File[] arrFiles = dir.listFiles();

        // Преобразование массива в список с использованием Arrays.asList
        List<File> lst = Arrays.asList(arrFiles);

        // Вывод первых 5 элементов списка на экран
        for (int i = 0; i < 3; i++)
        {
            System.out.println(lst.get(i));
        }
    }
}