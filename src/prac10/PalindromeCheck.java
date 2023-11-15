package prac10;

// Дано слово, состоящее только из строчных латинских букв. Проверьте,
// является ли это слово палиндромом. Выведите YES или NO.

public class PalindromeCheck
{

    public static void main(String[] args)
    {
        String word = "аннаr";
        if (isPalindrome(word))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word)
    {
        // Удаляем пробелы и приводим слово к нижнему регистру
        word = word.replaceAll("\\s+", "").toLowerCase();                                   // (\\ - исп. для передачи спец символа \s, который обозначает любой пробельный символ)
                                                                                                            // + указывает, что символов может быть больше одного. Замена на пустую строку, toLowerCase() - приведение к нижнему регистру

        // Вызываем вспомогательную рекурсивную функцию для проверки
        return isPalindromeRecursive(word, 0, word.length() - 1);
    }

    private static boolean isPalindromeRecursive(String word, int start, int end) // Функция проверки на палиндром
    {
        // Базовый случай (если начальный индекс больше или равен конечному, это палиндром)
        if (start >= end)
        {
            return true;
        }

        // Если текущие символы на начальной и конечной позициях не совпадают, это не палиндром
        if (word.charAt(start) != word.charAt(end)) // charAt - получение символа по указанному индексу
        {
            return false;
        }
        // Рекурсивно проверяем, сдвигая индексы
        return isPalindromeRecursive(word, start + 1, end - 1);
    }
}