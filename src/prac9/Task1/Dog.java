package prac9.Task1;

public class Dog implements Nameable
{
    protected String name;
    protected String breed;
    protected int age;

    public Dog(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAge()
    {
        return this.age;
    }
    public String getBreed()
    {
        return this.breed;
    }

    @Override
    public String getName()
    {
        return this.name;
    }
    @Override
    public String toString()
    {
        return "Dog | Name: " + getName() + "; Age: " + this.age + "; Breed: " + this.breed + ";";
    }


}
