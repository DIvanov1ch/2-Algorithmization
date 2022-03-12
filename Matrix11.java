package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
11. Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
в которых число 5 встречается три и более раз
*/

public class Matrix11 {

    public static void main(String[] args) {

        int[][] matrix;
        int count;

        matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (15 + 1));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Номера строк: ");
        for (int i = 0; i < matrix.length; i++) {
            count = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.print((i + 1) + ", ");
            }
        }

    }

}
