package prac5;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft, bottomRight; // topLeft - верхняя левая точка прямоугольника, bottomRight - нижняя правая точка прямоугольника

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
            // Сначала задаются координаты для верхней левой точки, затем для правой нижней, скорости у точек одинаковые по условию
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isEquSpeed() // Метод, проверяющий одна ли скорость у точек
            // Возвращает true, если совпадают
    {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }


    public void setSpeedForTopLeft(int xSpeed, int ySpeed)
    {
        topLeft.ySpeed = ySpeed;
        topLeft.xSpeed = xSpeed;
    }

    @Override
    public String toString()
    {
        return "MovableRectangle: " + " topLeft{x = " + topLeft.x + " y = "+ topLeft.y+ "}, bottomRight{x = " + bottomRight.x + ", y = " + bottomRight.y + "}; xSpeed = " + topLeft.xSpeed + " ySpeed = " + topLeft.ySpeed + "}";
    }

    @Override
    public void moveUp()
    {
        if (!isEquSpeed())
            System.out.println("Скорости точек прямоугольника не совпадают! Положение не изменилось");
        else
        {
            topLeft.moveUp();
            bottomRight.moveUp();
        }

    }

    @Override
    public void moveDown()
    {
        if (!isEquSpeed())
            System.out.println("Скорости точек прямоугольника не совпадают! Положение не изменилось");
        else
        {
            topLeft.moveDown();
            bottomRight.moveDown();
        }

    }

    @Override
    public void moveLeft()
    {
        if (!isEquSpeed())
            System.out.println("Скорости точек прямоугольника не совпадают! Положение не изменилось");
        else
        {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }

    }

    @Override
    public void moveRight()
    {
        if (!isEquSpeed())
            System.out.println("Скорости точек прямоугольника не совпадают! Положение не изменилось");
        else
        {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
