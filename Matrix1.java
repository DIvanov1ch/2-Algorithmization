package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
*/

public class Matrix1 {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = new int[][]{
                {10, 0, 0, 10, 20, 0, 1},
                {-2, -1, 0, 1, 2, 3, 1},
                {5, 4, 3, 2, 1, 0, 1},
                {101, 202, 302, -10, 25, 65, 1},
                {-25, 1, 0, 366, 100, 2, 1},
                {1, 2, 1, 2, 1, 2, 0},
        };

        for (int[] array : matrix) {
            for (int j = 0; j < array.length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(array[j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
}
