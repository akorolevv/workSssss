package prac15.Task2;

public class MVCPatternDemo
{
    public static void main(String[] args)
    {
        // Создаем модель, представление и контроллер
        Employee model = new Employee("Alexander Colsberg", 25.0, 41);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Выводим информацию о сотруднике
        controller.updateView();

        // Изменяем информацию о сотруднике и обновляем отображение
        controller.updateEmployeeInfo("John Dee", 25.0, 45);
        controller.updateView();
    }
}