package prac5;

public class MovableCircle implements Movable
{
    int radius;
    MovablePoint center; // Переменная типа MovablePoint(Переменная center ссылается на объект класса center) - Точка центра

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "MovableCircle{" + "radius =" + radius + " center=" + center.toString() + '}';
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}
