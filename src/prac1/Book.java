package prac1;

public class Book
{
    private int pages; // Количество страниц
    private String name; // Наименование книги
    private String author; // Автор книги
    private String genre; // Жанр книги

    public Book ()
    {
        pages = 1;
        name = "Kolobok";
        author = "Tolstoi";
        genre = "fairy tale";
    }
    public Book (int _pages, String _name)
    {
        pages = _pages;
        name = _name;
    }

    // Методы установки различных значений
    public void setName(String  __name)
    {
        this.name = __name;
    }
    public void setAuthor(String  __author)
    {
        this.author = __author;
    }
    public void setGenre(String  __genre)
    {
        this.genre = __genre;
    }
    public void setPages(int  __pages)
    {
        this.pages = __pages;
    }


    // Методы возвращения различных значений
    public int getPages()
    {
        return pages;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getGenre()
    {
        return genre;
    }
    public String toString()
    {
        return "Name: " + this.name+ ";" + " Author: " + this.author + ";" + " Genre: " + this.genre + ";" + " Pages: " + this.pages + ".";
    }
}
