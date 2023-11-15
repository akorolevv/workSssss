package prac20_ready.Task2;

import javax.swing.*;
import java.awt.*;

public class RPNView
{
    private JPanel mainPanel;
    private JTextField inputField;
    private JButton calculateButton;
    private JTextField displayField;

    private RPNController controller;

    public RPNView () {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        inputField = new JTextField(20);
        calculateButton = new JButton("=");
        displayField = new JTextField(20);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 20));

        mainPanel.add(inputField);
        mainPanel.add(calculateButton);
        mainPanel.add(displayField);
    }

    public void setController(RPNController controller) {
        this.controller = controller;
        calculateButton.addActionListener(controller);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void updateDisplay(String text) {
        displayField.setText(text);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
