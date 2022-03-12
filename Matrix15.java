package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
15. Найдите наибольший элемент матрицы и замените все нечетные элементы на него
*/

public class Matrix15 {

    public static void main(String[] args) {

        int[][] matrix;
        int max;

        matrix = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18},
                {20, 30, 40, 50, 60, 70, 80, 100, 10},
                {6, 55, 55, 6, 22, 11, 1, 2, 9},
                {2, 3, 2, 3, 2, 3, 2, 3, 2},
                {1, 2, 33, 2, 1, 3, 2, 1, 2},
                {42, 22, 25, 65, 42, 22, 45, 65, 2},
                {1, 2, 3, 5, 6, 5, 6, 5, 5},
        };
        max = matrix[0][0];

        for (int[] array : matrix) {
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("Наибольший элемент матрицы: " + max);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }

        System.out.println("\nМатрица после замены: ");
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
