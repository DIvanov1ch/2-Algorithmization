package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
7. Сформировать квадратную матрицу порядка N по правилу:
   A[I,J] = sin((I^2 - J^2) / N)
   и подсчитать количество положительных элементов в ней
*/

public class Matrix7 {

    public static void main(String[] args) {

        double[][] matrix;
        int n;
        int result;

        n = 7;
        matrix = new double[n][n];
        result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / (double) n);
                if (matrix[i][j] > 0) {
                    result++;
                }
            }
        }

        for (double[] array : matrix) {
            for (double num : array) {
                System.out.printf("%.2f,\t", num);
            }
            System.out.println();
        }

        System.out.println("\nКоличество положительных элементов: " + result);
    }
}
