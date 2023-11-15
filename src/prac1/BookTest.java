package prac1;

public class BookTest
{
    public static void main (String[] args)
    {
        Book book1 = new Book();
        System.out.println("Информация о первой книге: ");
        System.out.println(book1);
        book1.setPages(33);
        book1.setName("Alphabet");
        book1.setAuthor("Kirill and Mefody");
        book1.setGenre("classic");
        System.out.println("Обновлённая информация о первой книге: ");
        System.out.println(book1);

        Book book2 = new Book(15, "Abcd");
        System.out.println("Информация о второй книге: ");
        System.out.println(book2);
        book2.setAuthor("Vavava");
        book2.setGenre("fantastic");
        System.out.println("Обновлённая информация о второй книге: ");
        System.out.println(book2);
    }
}
