package prac18.Task5;

public class Matrix<T>
{
    private final int rows;
    private final int columns;
    private final T[][] data; // сам двумерный массив

    public Matrix(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        // приводим массив Object к типу T[], где T - это параметр типа, определенный для класса Matrix
        // сначала мы создаём Двумерный массив с объектами типа Object, а потом приводим их к двумерному массиву типа T
        this.data = (T[][]) new Object[rows][columns];
    }

    public void set(int row, int column, T value)
    {
        if (row < 0 || row >= rows || column < 0 || column >= columns)
        {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        data[row][column] = value;
    }

    public T get(int row, int column)
    {
        if (row < 0 || row >= rows || column < 0 || column >= columns)
        {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        return data[row][column];
    }

    public int getRows()
    {
        return rows;
    }

    public int getColumns()
    {
        return columns;
    }

    // Другие методы для операций с матрицами могут быть добавлены здесь

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

