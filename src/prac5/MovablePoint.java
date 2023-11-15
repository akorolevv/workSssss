package prac5;

public class MovablePoint implements Movable
{
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString()
    {
        return "MovablePoint{" + "x =" + this.x + " y =" + this.y + " xSpeed=" + this.xSpeed + " ySpeed=" + this.ySpeed + "}";
    }
    @Override
    public void moveUp() // За движение вверх отвечает ось y + "значение"
    {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() // За движение вниз отвечает ось y - "значение"
    {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() // За движение влево отвечает ось x - "значение"
    {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() // За движение вправо отвечает ось x + "значение"
    {
        x = x + xSpeed;
    }
}
