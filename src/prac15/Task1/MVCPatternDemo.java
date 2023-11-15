package prac15.Task1;

public class MVCPatternDemo
{
    public static void main(String[] args)
    {
        // Создаем модель, представление и контроллер
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновляем данные модели и отображаем их через контроллер
        controller.updateView();

        // Изменяем имя студента и обновляем отображение
        controller.setStudentName("Alexander");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase()
    {
        // Здесь можно реализовать логику получения данных студента из базы данных
        Student student = new Student();
        student.setName("Vladimir");
        student.setRollNo("12345");
        return student;
    }
}





