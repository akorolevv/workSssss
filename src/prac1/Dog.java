package prac1;

public class Dog
{
    private int age; // Возраст
    private float weight; // Вес
    private String name; // Имя
    private String breed; // Порода
    public Dog() // Конструктор по умолчанию
    {
        age = 1;
        weight = 9.8f;
        name = "Johny";
        breed = "Husky";

    }

    public Dog(String a, String b) // Второй конструктор
    {
        name = a;
        breed = b;
        age = 0;
        weight = 0f;
    }

    // Методы установки различных значений
    public void setAge(int _age)
    {
        this.age = _age;
    }
    public void setWeight(float _weight)
    {
        this.weight = _weight;
    }
    public void setName(String _name)
    {
        this.name = _name;
    }
    public void setBreed(String _breed)
    {
        this.breed = _breed;
    }

    // Методы возвращения различных значений
    public int getAge()
    {
        return age;
    }
    public float getWeight()
    {
        return weight;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }

    public String toString()
    {
        return "Name: " + this.name+ ";" + " Breed: " + this.breed + ";" + " Age: " + this.age + ";" + " Weight: " + this.weight + ";";
    }


}
