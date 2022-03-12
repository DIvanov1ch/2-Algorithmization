package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Массивы массивов
8. В числовой матрице поменять местами два любых столбца. Номера столбцов вводит пользователь с клавиатуры
*/

public class Matrix8 {

    public static void main(String[] args) {

        int[][] matrix;
        int first;
        int second;
        int tmp;

        matrix = new int[][]{
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7},
        };


        System.out.printf("Введите номера 2-х столбцов (№№ 1 - %d), которые хотите поменять местами", matrix.length);
        System.out.println();

        first = readFromConsole("Номер 1-го столбца: ");
        second = readFromConsole("Номер 2-го столбца: ");

        if (first > second) {
            first = first + second;
            second = first - second;
            first = first - second;
        }

        for (int i = 0; i < matrix.length; i++) {
            tmp = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = tmp;
        }

        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    private static int readFromConsole(String message) {

        Scanner in = new Scanner(System.in);

        System.out.println(message);
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println(message);
        }
        return in.nextInt();
    }
}
