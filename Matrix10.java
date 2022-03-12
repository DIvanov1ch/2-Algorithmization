package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
10. Найти положительные элементы главной диагонали квадратной матрицы
*/

public class Matrix10 {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = new int[][]{
                {-1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, -3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, -5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, -7},
        };

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + ", ");
            }
        }
    }
}
