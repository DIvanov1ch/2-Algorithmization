package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
6. Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
                  ( 1    1    1    ...    1    1    1 )
                  ( 0    1    1    ...    1    1    0 )
                  ( 0    0    1    ...    1    0    0 )
                  (...  ...  ...   ...   ...  ...  ...)
                  ( 0    1    1    ...    1    1    0 )
                  ( 1    1    1    ...    1    1    1 )
*/

public class Matrix6 {

    public static void main(String[] args) {

        int[][] matrix;
        int n;

        n = 12;
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix.length / 2) {
                for (int j = i; j < matrix[i].length - i; j++) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = i; j >= matrix[i].length - 1 - i; j--) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
