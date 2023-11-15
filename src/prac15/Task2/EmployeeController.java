package prac15.Task2;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void updateEmployeeInfo(String name, double hourlyRate, int hoursWorked)
    {
        model = new Employee(name, hourlyRate, hoursWorked);
    }

    public void updateView()
    {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}
