package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
*/

public class Matrix12 {

    public static void main(String[] args) {

        int[][] matrix;
        int tmp;

        matrix = new int[][]{
                {0, 4, 3, 0, 6, 11, 10, 8, 10, 0, 5, 7, 9, 2, 11},
                {0, 9, 12, 0, 12, 1, 2, 1, 6, 5, 7, 6, 14, 8, 9},
                {12, 7, 11, 9, 8, 0, 14, 13, 6, 11, 13, 5, 9, 10, 10},
                {11, 4, 0, 3, 8, 7, 14, 0, 7, 4, 8, 4, 6, 2, 4},
                {5, 10, 10, 14, 12, 0, 5, 10, 12, 11, 10, 1, 7, 10, 8},
                {4, 13, 4, 9, 6, 13, 3, 2, 14, 6, 5, 11, 8, 14, 0},
                {0, 13, 12, 8, 6, 2, 14, 5, 1, 8, 7, 9, 8, 8, 8},
                {5, 7, 13, 11, 5, 6, 10, 11, 3, 8, 9, 13, 14, 11, 1},
                {13, 14, 12, 10, 2, 2, 11, 1, 10, 7, 3, 3, 3, 4, 2},
                {14, 5, 4, 5, 1, 6, 5, 1, 4, 1, 8, 2, 12, 12, 1},
        };

        //Сортируем строки по возрастанию
        for (int[] array : matrix) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    if (array[j - 1] > array[j]) {
                        tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        System.out.println("Строки по возрастанию: ");
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //Сортируем строки по убыванию
        for (int[] array : matrix) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j + 1] > array[j]) {
                        tmp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        System.out.println("\nСтроки по убыванию: ");
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
