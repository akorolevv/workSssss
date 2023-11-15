package prac20_ready.Task2;
import javax.swing.*;

public class Main
    // 8 9 + 1 7 - * выход: -102
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RPNModel model = new RPNModel();
            RPNView view = new RPNView();
            RPNController controller = new RPNController(model, view);
            view.setController(controller);

            JFrame frame = new JFrame("RPN Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(view.getMainPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
