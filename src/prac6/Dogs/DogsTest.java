package prac6.Dogs;

public class DogsTest
{
        public static void main(String[] args)
        {
            // Создание объектов разных пород собак
            Labrador labrador = new Labrador("Рекс", 3);
            Bulldog bulldog = new Bulldog("Макс", 2);

            // Голос собак
            labrador.bark();
            bulldog.bark();

            // Вывод информации о собаках
            System.out.println(labrador);
            System.out.println(bulldog);
        }
}

