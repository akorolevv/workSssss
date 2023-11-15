package prac24_ready;
import java.util.Objects;
public final class Dish implements Item
{
    final String name;
    final String description;
    final int cost;


    public Dish(int cost, String name, String description) throws IllegalArgumentException
    {
        if (cost == 0 || Objects.equals(name, "") || Objects.equals(description, ""))
            throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return this.getName() + " | Цена: " + this.getCost();
    }

}
