package by.epam.trukhanovich.algorithmization;

/*
Массивы массивов
16. Построить магический квадрат порядка n
*/

public class Matrix16 {

    public static void main(String[] args) {

        // Нечетные квадраты по методу де ла Лубера
        int[][] magicSquare;
        int n;
        int i;
        int j;
        int num;
        int curI;
        int curJ;

        n = 7;
        magicSquare = new int[n][n];
        i = 0;
        j = n / 2;
        num = 1;

        while (num <= n * n) {
            magicSquare[i][j] = num;
            num++;
            curI = i;
            curJ = j;
            i--;
            j++;

            if (i < 0) {
                i = n - 1;
            }

            if (j > n - 1) {
                j = 0;
            }

            if (magicSquare[i][j] != 0) {
                i = curI + 1;
                j = curJ;
            }
        }

        System.out.println("Квадрат " + n + "x" + n);
        System.out.println("Магическая сумма: " + (n * (n * n + 1) / 2.0));
        for (int[] array : magicSquare) {
            for (int numb : array) {
                System.out.print(numb + "\t");
            }
            System.out.println();
        }
        System.out.println();


        // Четно-четные магические квадраты (m = 4 * k (k = 1, 2, 3...))
        int[][] magSq;
        int m;
        int mark;
        int number;

        m = 16;
        magSq = new int[m][m];
        mark = -1;
        number = 1;

        // Маркируем клетки
        for (int o = 0; o < m / 2; o++) {
            for (int p = 0; p < m / 2; p++) {
                magSq[o][p] = mark;
                magSq[o][magSq.length - 1 - p] = magSq[o][p];
                mark = -mark;
            }
            mark = -mark;
        }

        // Расставляем числа
        for (int k = 0; k < m / 2; k++) {
            for (int l = 0; l < m; l++) {
                if (magSq[k][l] < 0) {
                    magSq[k][l] = m * m + 1 - number;
                    magSq[m - 1 - k][m - 1 - l] = number;
                } else {
                    magSq[k][l] = number;
                    magSq[m - 1 - k][m - 1 - l] = m * m + 1 - number;
                }
                number++;
            }

        }

        System.out.println("Квадрат " + m + "x" + m);
        System.out.println("Магическая сумма: " + (m * (m * m + 1) / 2.0));
        for (int[] arr : magSq) {
            for (int ints : arr) {
                System.out.print(ints + "\t");
            }
            System.out.println();
        }

    }

}

