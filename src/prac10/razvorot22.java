package prac10;

// Дано число n, десятичная запись которого не содержит нулей. Получите
// число, записанное теми же цифрами, но в противоположном порядке

public class razvorot22
{
        private static int revers(int num)
        {
            // Проверяем, есть ли нули в числе
            if (containsZero(num))
            {
                System.out.println("Число содержит ноль.");
                return 0;

            }
            return revers(num, 0);
        }

        private static boolean containsZero(int num)
        {
            while (num > 0)
            {
                if (num % 10 == 0) // Если число поделилось на 10 без остатка, значит в нём точно есть ноль
                {
                    return true;
                }
                num /= 10; // Делим число на 10 для дальнейшей проверки
            }
            return false; // Если цикл выполнился, значит число не содержит ноль
        }

        private static int revers(int num, int rev)
        {
            // Базовый случай
            // Когда num равно 0, это означает, что мы обработали все цифры числа,
            // и rev содержит результат переворачивания числа.
            if (num == 0)
            {
                return rev;
            }

            // Рекурсивный случай
            // Делим исходное число num на 10, чтобы отбросить последнюю цифру
            // И умножаем rev на 10 и добавляем к нему последнюю цифру из num.
            // Это позволяет нам постепенно переворачивать число.
            return revers(num / 10, 10 * rev + num % 10);
        }

        public static void main(String[] args) {
            int a = 703;
            int result = revers(a);
            if (result == 0)
            {
                System.out.println("Программа завершила работу");
            }
            else
            {
                System.out.println("Исходное число: " + a);
                System.out.println("Перевёрнутое число: " + result);
            }

        }

}
