package prac20_ready;

// последний вошел - первый вышел
import java.util.Stack;

public class Task1
{
    public static Integer evaluateRPN(String[] tokens)
    {
        int returnValue = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String token : tokens)
        {
            if (!operators.contains(token))
            {
                stack.push(token);
            } else
            {
                if (stack.size() < 2) {
                    System.out.println("Ошибка: вы ввели некорректное выражение");
                    return null;
                }
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                if (token.equals("/") && a == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно");
                    return null;
                }
                int index = operators.indexOf(token);
                switch (index)
                {
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b - a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }

        if (stack.size() != 1) {
            System.out.println("Ошибка: вы ввели некорректное выражение");
            return null;
        }

        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }

    public static void main(String[] args)
    {
        // "8", "9", "+", "1", "7", "-", "*"
        // Проверка ошибок:
        // "8", "9", "+", "1", "7", "-", "*", "+"
        // "2", "0", "/"
        String[] tokens = new String[]{"8", "9", "+", "1", "7", "-", "*"};
        Integer result = evaluateRPN(tokens);
        if (result != null) {
            System.out.println("Result: " + result);
        }
    }
}

