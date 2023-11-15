package prac10;

// Дано число n, десятичная запись которого не содержит нулей. Получите
// число, записанное теми же цифрами, но в противоположном порядке

public class Razvorot
{

    private static int revers(int num)
    {
        return revers(num, 0);
    }
    private static int revers(int num, int rev)
    {

        // Базовый случай
        // Когда num равно 0, это означает, что мы обработали все цифры числа,
        // и rev содержит результат переворачивания числа.
        if (num == 0)
        {
            return rev; // Возвращаем результат.
        }

        // Рекурсивный случай
        // Делим исходное число num на 10, чтобы отбросить последнюю цифру
        // И умножаем rev на 10 и добавляем к нему последнюю цифру из num.
        // Это позволяет нам постепенно переворачивать число.
        return revers(num / 10, 10 * rev + num % 10);
    }

    public static void main(String[] args)
    {
        int a = 500;
        int result = revers(a);
        System.out.println("Исходное число: " + a);
        System.out.println("Перевёрнутое число: " + result);

    }

}
