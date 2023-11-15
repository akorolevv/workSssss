package prac20_ready.trrr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        double input1, input2;

        try {
            input1 = view.getInput1();
            input2 = view.getInput2();
        } catch (NumberFormatException exception) {
            view.updateDisplay("Error");
            return;
        }

        switch (command) {
            case "Сложить":
                model.performOperation(input1, input2, "+");
                break;
            case "Вычесть":
                model.performOperation(input1, input2, "-");
                break;
            case "Умножить":
                model.performOperation(input1, input2, "*");
                break;
            case "Разделить":
                model.performOperation(input1, input2, "/");
                break;
            default:
                view.updateDisplay("Error");
                return;
        }

        view.updateDisplay(Double.toString(model.getResult()));
    }
}


