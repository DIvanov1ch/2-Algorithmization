package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
*/

public class Matrix2 {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = new int[][]{
                {0, 10, 10, 10, 20, 10},
                {-2, 1, 0, 10, 2, 3},
                {5, 4, 2, 3, 1, 0},
                {101, 202, 302, 3, 25, 65},
                {-255, 1, 0, 366, 4, 2},
                {1, 2, 1, 2, 1, 5},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + ", ");
                }
            }
        }
    }
}
