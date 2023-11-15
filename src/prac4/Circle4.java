package prac4;

class Circle4
{
    private double radius; // Радиус окружности

    public Circle4(double radius)
    {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double Area() // площадь
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() // длина окружности
    {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return "Circle | Radius: " + this.radius + ".";
    }
}




