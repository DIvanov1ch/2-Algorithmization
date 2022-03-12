package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
4. Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
                  (1    2    3    ...    n)
                  (n   n-1  n-2   ...    1)
                  (1    2    3    ...    n)
                  (n   n-1  n-2   ...    1)
                  (... ...  ...   ...  ...)
                  (n   n-1  n-2   ...    1)
*/

public class Matrix4 {

    public static void main(String[] args) {

        int[][] matrix;
        int n;

        n = 6;
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = n - j;
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

