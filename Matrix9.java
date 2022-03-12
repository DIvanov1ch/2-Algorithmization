package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму
*/

public class Matrix9 {

    public static void main(String[] args) {

        int[][] matrix;
        int max;
        int sum;
        int pos;

        max = 0;
        pos = 0;
        matrix = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18},
                {20, 30, 40, 50, 60, 70, 80, 90, 10},
                {6, 55, 55, 6, 22, 11, 1, 2, 9},
                {2, 3, 2, 3, 2, 3, 2, 3, 2},
                {1, 2, 33, 2, 1, 3, 2, 1, 2},
                {42, 22, 25, 65, 42, 22, 45, 65, 72},
                {1, 2, 3, 5, 6, 5, 6, 5, 5},
        };

        for (int j = 0; j < matrix[0].length; j++) {
            sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            if (sum > max) {
                max = sum;
                pos = j + 1;
            }
        }

        System.out.println("Максимаьная сумма: " + max + "\nСтолбец: " + pos);

    }
}
