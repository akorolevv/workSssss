package prac4;

public class BookTest
{
    public static void main(String[] args)
    {
        // Создаем объект книги
        Book book = new Book("Пушкин", "Капитанская дочка", 1836);

        // Выводим информацию о книге
        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменяем информацию о книге
        book.setAuthor("Достоевский");
        book.setTitle("Преступление и наказание");
        book.setYear(1866);

        // Выводим обновленную информацию о книге
        System.out.println("Новый автор книги: " + book.getAuthor());
        System.out.println("Новое название книги: " + book.getTitle());
        System.out.println("Новый год написания: " + book.getYear());
    }
}