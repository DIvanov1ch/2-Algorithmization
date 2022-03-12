package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
5. Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
                  ( 1    1    1    ...    1    1    1 )
                  ( 2    2    2    ...    2    2    0 )
                  ( 3    3    3    ...    3    0    0 )
                  (...  ...  ...   ...   ...  ...  ...)
                  (n-1  n-1   0    ...    0    0    0 )
                  ( n    0    0    ...    0    0    0 )
*/

public class Matrix5 {

    public static void main(String[] args) {

        int[][] matrix;
        int n;

        n = 10;
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
            }
            n--;
        }

        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
