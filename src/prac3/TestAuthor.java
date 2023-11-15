package prac3;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Alex","alex228@yandex.ru",'J');
        System.out.println(author1);
        author1.setEmail("alex1337@gmail.com");
        char temple = author1.getGender();
        System.out.println(author1);
        System.out.println("gender of author: " + temple);
    }
}
