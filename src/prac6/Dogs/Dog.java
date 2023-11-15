package prac6.Dogs;

public abstract class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog()
    {
        this.name = "Jack";
        this.age = 5;
    }

    public abstract void bark();

    // Геттеры и сеттеры для свойств
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}