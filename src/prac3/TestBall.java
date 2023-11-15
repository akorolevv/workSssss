package prac3;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball1 = new Ball(1.1,2.2);
        System.out.println(ball1);
        ball1.setX(2.3);
        System.out.println(ball1);
        ball1.setXY(5.1, 4.7);
        System.out.println(ball1);
        ball1.move(2.5,3.6);
        System.out.println(ball1);

    }
}
