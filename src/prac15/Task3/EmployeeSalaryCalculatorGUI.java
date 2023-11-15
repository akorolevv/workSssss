package prac15.Task3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeSalaryCalculatorGUI {
    private NewEmployee model;
    private NewEmployeeView view;
    private NewEmployeeController controller;

    private JTextField nameField;
    private JTextField hourlyRateField;
    private JTextField hoursWorkedField;
    private JButton calculateButton;

    public EmployeeSalaryCalculatorGUI() {
        // Создаем модель, представление и контроллер
        model = new NewEmployee("John Doe", 20.0, 40);
        view = new NewEmployeeView();
        controller = new NewEmployeeController(model, view);

        // Создаем GUI
        JFrame frame = new JFrame("Employee Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        frame.add(panel);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField(model.getName());
        panel.add(nameField);

        panel.add(new JLabel("Hourly Rate:"));
        hourlyRateField = new JTextField(String.valueOf(model.getHourlyRate()));
        panel.add(hourlyRateField);

        panel.add(new JLabel("Hours Worked:"));
        hoursWorkedField = new JTextField(String.valueOf(model.getHoursWorked()));
        panel.add(hoursWorkedField);

        calculateButton = new JButton("Calculate Salary");
        panel.add(calculateButton);

        // Добавляем слушателей событий для кнопки Calculate Salary
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateModelFromFields();
                double salary = model.calculateSalary();
                // Отображаем результат в диалоговом окне
                JOptionPane.showMessageDialog(frame, "Salary: $" + salary);
            }
        });

        frame.setVisible(true);
    }

    private void updateModelFromFields() {
        model.setName(nameField.getText());
        model.setHourlyRate(Double.parseDouble(hourlyRateField.getText()));
        model.setHoursWorked(Integer.parseInt(hoursWorkedField.getText()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSalaryCalculatorGUI();
            }
        });
    }
}