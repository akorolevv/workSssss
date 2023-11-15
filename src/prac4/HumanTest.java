package prac4;

public class HumanTest
{
    public static void main(String[] args)
    {
        Head head = new Head("Blue", "Blonde");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(7);
        Hand rightHand = new Hand(7);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Вывод информации о частях тела человека
        System.out.println("Цвет глаз: " + human.getHead().getEyeColor());
        System.out.println("Цвет волос: " + human.getHead().getHairColor());
        System.out.println("Длина левой ноги: " + human.getLeftLeg().getLength() + " см");
        System.out.println("Длина правой ноги: " + human.getRightLeg().getLength() + " см");
        System.out.println("Размер левой руки: " + human.getLeftHand().getFingerSize());
        System.out.println("Размер правой руки: " + human.getRightHand().getFingerSize());
    }
}