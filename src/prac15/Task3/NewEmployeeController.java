package prac15.Task3;

public class NewEmployeeController
{
    private NewEmployee model;
    private NewEmployeeView view;

    public NewEmployeeController(NewEmployee model, NewEmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void updateEmployeeInfo(String name, double hourlyRate, int hoursWorked)
    {
        model = new NewEmployee(name, hourlyRate, hoursWorked);
    }

    public void updateView()
    {
        view.printNewEmployeeDetails(model.getName(), model.calculateSalary());
    }
}
