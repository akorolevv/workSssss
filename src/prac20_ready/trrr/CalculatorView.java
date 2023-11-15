package prac20_ready.trrr;

import javax.swing.*;
import java.awt.*;


public class CalculatorView {
    private JPanel mainPanel;
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField displayField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    private CalculatorController controller;

    public CalculatorView() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2));

        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        displayField = new JTextField(10);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));

        addButton = new JButton("Сложить");
        subtractButton = new JButton("Вычесть");
        multiplyButton = new JButton("Умножить");
        divideButton = new JButton("Разделить");

        mainPanel.add(new JLabel("Число 1:"));
        mainPanel.add(inputField1);
        mainPanel.add(new JLabel("Число 2:"));
        mainPanel.add(inputField2);
        mainPanel.add(addButton);
        mainPanel.add(subtractButton);
        mainPanel.add(multiplyButton);
        mainPanel.add(divideButton);
        mainPanel.add(new JLabel("Результат:"));
        mainPanel.add(displayField);
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
        addButton.addActionListener(controller);
        subtractButton.addActionListener(controller);
        multiplyButton.addActionListener(controller);
        divideButton.addActionListener(controller);
    }

    public void updateDisplay(String text) {
        displayField.setText(text);
    }

    public double getInput1() {
        return Double.parseDouble(inputField1.getText());
    }

    public double getInput2() {
        return Double.parseDouble(inputField2.getText());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

