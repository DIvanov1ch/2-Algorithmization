package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
*/

public class Matrix3 {

    public static void main(String[] args) {

        int[][] matrix;
        int k;
        int p;

        k = 7;
        p = 3;

        matrix = new int[][]{
                {0, 0, 10, 0, 20, 0, 1},
                {-2, 1, 8, 0, 2, 3, 5},
                {5, 4, 2, 0, 1, 0, -1},
                {0, 0, 0, 0, 0, 0, 0},
                {-255, 1, 8, 0, 4, 2, 6},
                {1, 2, 1, 0, 1, 52},
                {10, 20, 1, 0, 10, 5, 55},
        };

        System.out.println("Строка " + k + ": ");
        for (int j = 0; j < matrix[k - 1].length; j++) {
            System.out.print(matrix[k - 1][j] + " ");
        }

        System.out.println();

        System.out.println("Столбец " + p + ": ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][p - 1]);
        }

    }
}
