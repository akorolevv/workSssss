package prac12;

public class Stack
{
    private static java.util.Stack<Integer> firstDeck = new java.util.Stack<>(); // Колода первого игрока
    private static java.util.Stack<Integer> secondDeck = new java.util.Stack<>(); // Колода второго игрока

    // first - карты первого, second - карты второго
    Stack(String[] first, String[] second)
    {
        for (int i = 4; i >= 0; i--)
        {
            firstDeck.add(Integer.parseInt(first[i])); // Добавляем карту из строки first в колоду первого игрока.
            secondDeck.add(Integer.parseInt(second[i])); // Добавляем карту из строки second в колоду второго игрока.
        }
    }

    // Метод проведения игры
    public static String play(String[] first, String[] second)
    {
        // Создаём экземпляр класса Stack и инициализируем колоды картами.
        new Stack(first, second);

        // Цикл ходов, не превышающий 106 по условию
        for (int i = 0; i < 106; i++)
        {
            // Колода первого пуста --> второй игрок победил
            if (firstDeck.size() == 0)
                return "second " + i;
            else if (secondDeck.size()== 0) // Колода второго пуста --> первый победил
                return "first "+ i;
            else
            {
                // Извлекаем верхнюю карту из колоды каждого игрока и заносим их в a и b
                Integer a = firstDeck.pop();
                Integer b = secondDeck.pop();

                // По условию: 0 побеждает 9 и возврат карт в колоду первого игрока
                if (a == 0 && b == 9)
                {
                    firstDeck.add(0, a);
                    firstDeck.add(0, b);
                }
                // По условию: 0 побеждает 9 и возврат карт в колоду второго игрока
                else if (b == 0 && a == 9)
                {
                    secondDeck.add(0, a);
                    secondDeck.add(0, b);
                }

                // Большая карта бьёт меньшую

                else if(a > b)
                {
                    firstDeck.add(0, a);
                    firstDeck.add(0, b);
                }
                else
                {
                    secondDeck.add(0, a);
                    secondDeck.add(0, b);
                }
            }
        }
        return "botva"; // Если игра не завершилась за 106 ходов --> вывод слова botva
    }
}