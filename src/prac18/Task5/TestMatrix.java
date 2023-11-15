package prac18.Task5;

public class TestMatrix
{
    public static void main(String[] args)
    {
        Matrix<Integer> intMatrix = new Matrix<>(3, 3);

        intMatrix.set(0, 0, 1);
        intMatrix.set(0, 1, 2);
        intMatrix.set(0, 2, 3);
        intMatrix.set(1, 0, 4);
        intMatrix.set(1, 1, 5);
        intMatrix.set(1, 2, 6);
        intMatrix.set(2, 0, 7);
        intMatrix.set(2, 1, 8);
        intMatrix.set(2, 2, 9);

        System.out.println("Integer Matrix:");
        System.out.println(intMatrix);
        System.out.println("Количество столбцов: " + intMatrix.getColumns());
        // отчёт строк и колонок начинается с нуля
        System.out.println("Третий элемент третьей строки: " + intMatrix.get(2,2));

        Matrix<Double> doubleMatrix = new Matrix<>(2, 2);

        doubleMatrix.set(0, 0, 1.1);
        doubleMatrix.set(0, 1, 2.2);
        doubleMatrix.set(1, 0, 3.3);
        doubleMatrix.set(1, 1, 4.4);

        System.out.println("\nDouble Matrix:");
        System.out.println(doubleMatrix);

        doubleMatrix.set(0, 1, 221.0);

        System.out.println("\nDouble Matrix:");
        System.out.println(doubleMatrix);

    }
}

