package prac4;

// Класс, описывающий книгу
class Book {
    private String author;     // Автор книги
    private String title;      // Название книги
    private int year;          // Год написания

    // Конструктор для создания объекта книги
    public Book(String author, String title, int year)
    {
        this.author = author;
        this.title = title;
        this.year = year;
    }


    public String getAuthor()
    {
        return author;
    }


    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return "Book | Author: " + this.author + ";" + " Title: " + this.title + ";" + " Year: " + this.year + ".";
    }
}



