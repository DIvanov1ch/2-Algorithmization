package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
*/
public class Matrix14 {

    public static void main(String[] args) {

        int[][] matrix;
        int m;
        int n;

        m = 5 + (int) (Math.random() * 6);
        n = 5 + (int) (Math.random() * 6);

        if (m < n) {
            System.out.println("Строк меньше чем столбцов. Невозможно выполнить условие задачи");
            System.exit(1);
        }

        matrix = new int[m][n];

        // Первый способ (случайный размер, не случайное расположение)
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                matrix[i][j] = 1;
            }
        }

        System.out.printf("Матрица: %d x %d\n", m, n);
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Второй способ (случайное расположение единиц)
        m = 5 + (int) (Math.random() * 6);
        n = 5 + (int) (Math.random() * 6);

        if (m < n) {
            System.out.println("\nСтрок меньше чем столбцов. Невозможно выполнить условие задачи");
            System.exit(2);
        }

        matrix = new int[m][n];

        int sum;
        for (int j = 0; j < n; j++) {
            sum = 0;
            while (sum != j + 1) {
                int i = (int) (Math.random() * m);
                matrix[i][j] = 1;

                sum = 0;
                for (int[] array : matrix) {
                    sum += array[j];
                }

            }
        }

        System.out.printf("Матрица: %d x %d\n", m, n);
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
