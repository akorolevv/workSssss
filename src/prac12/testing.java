package prac12;

import java.util.Scanner;

public class testing
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колоды игроков (разделяя их пробелом):");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 2)
        {
            String firstInput = parts[0];
            String secondInput = parts[1];

            String[] first = firstInput.split("");
            String[] second = secondInput.split("");

            System.out.println("\nТестирование через Stack:");
            System.out.println(Stack.play(first, second));
            System.out.println("\nТестирование через Queue:");
            System.out.println(Queue.play(first, second));
            System.out.println("\nТестирование через Deque:");
            System.out.println(Deque.play(first, second));
            System.out.println("\nТестирование через DoubleList:");
            System.out.println(DoubleList.play(first, second));
        }
    }
}
