package prac15.Task2;

public class Employee
{
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getHourlyRate()
    {
        return hourlyRate;
    }
    public void setHourlyRate(double rate)
    {
        this.hourlyRate = rate;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    public void setHoursWorked(int hours)
    {
        this.hoursWorked = hours;
    }
    public double calculateSalary()
    {
        return hourlyRate * hoursWorked;
    }
}
