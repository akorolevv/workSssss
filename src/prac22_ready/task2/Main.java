package prac22_ready.task2;

public class Main {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory(); // Создание объекта factory типа AbstractChairFactory и присвоение ему экземпляра ChairFactory
        Client client = new Client(); // Создание объекта client типа Client

        VictorianChair victorianChair = factory.createVictorianChair(20); // Создание викторианского стула с возрастом 20
        MagicChair magicChair = factory.createMagicChair(); // Создание магического стула
        FunctionalChair functionalChair = factory.createFunctionalChair(); // Создание многофункционального стула

        client.setChair(victorianChair); // Установка викторианского стула для клиента
        client.sit(); // Вызов метода sit для клиента

        client.setChair(magicChair); // Установка магического стула для клиента
        client.sit(); // Вызов метода sit для клиента

        magicChair.doMagic(); // Вызов метода doMagic для магического стула

        client.setChair(functionalChair); // Установка многофункционального стула для клиента
        client.sit(); // Вызов метода sit для клиента
    }
}