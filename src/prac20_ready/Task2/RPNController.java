package prac20_ready.Task2;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNController implements ActionListener {
    private RPNModel model;
    private RPNView view;

    public RPNController(RPNModel model, RPNView view)
    {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("=")) {
            String input = view.getInput();
            if (input.isEmpty()) {
                view.updateDisplay("Error: No input");
                return;
            }

            String[] tokens = input.split("\\s+");
            Stack<Double> stack = new Stack<>();

            for (String token : tokens) {
                if (isNumber(token)) {
                    stack.push(Double.parseDouble(token));
                } else if (isOperator(token)) {
                    if (stack.size() < 2) {
                        view.updateDisplay("Error: Invalid expression");
                        return;
                    }

                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result = performOperation(operand1, operand2, token);
                    stack.push(result);
                } else {
                    view.updateDisplay("Error: Invalid input");
                    return;
                }
            }

            if (stack.size() != 1) {
                view.updateDisplay("Error: Invalid expression");
                return;
            }

            view.updateDisplay(Double.toString(stack.pop()));
        }
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    view.updateDisplay("Error: Division by zero");
                    return Double.NaN;
                }
                return operand1 / operand2;
            default:
                view.updateDisplay("Error: Invalid operator");
                return 0;
        }
    }
}