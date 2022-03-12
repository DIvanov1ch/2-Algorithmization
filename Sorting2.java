package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
2. Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Дополнительный массив не использовать
*/

public class Sorting2 {

    public static void main(String[] args) {

        int[] arrayOne;
        int[] arrayTwo;
        int[] arrayThree;

        arrayOne = new int[]{-1, 0, 2, 4, 8, 16, 32, 64, 128};
        arrayTwo = new int[]{-10, -5, 0, 0, 5, 10, 15, 20, 25, 30, 35};

        arrayThree = new int[arrayOne.length + arrayTwo.length];

        System.out.println("Первый способ");
        // Копируем два массива в новый и потом сортируем его

        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayOne.length) {
                arrayThree[i] = arrayOne[i];
            } else {
                arrayThree[i] = arrayTwo[i - arrayOne.length];
            }

        }

        System.out.println(Arrays.toString(arrayThree));

        int tmp;
        for (int i = 0; i < arrayThree.length - 1; i++) {
            for (int j = arrayThree.length - 1; j > i; j--) {
                if (arrayThree[j] < arrayThree[j - 1]) {
                    tmp = arrayThree[j - 1];
                    arrayThree[j - 1] = arrayThree[j];
                    arrayThree[j] = tmp;
                }

            }

        }

        System.out.println(Arrays.toString(arrayThree));
        System.out.println();



        System.out.println("Второй способ");
        // Сравниваем числа из двух массивов. Затем вставляем их в новый

        int n = (int) (Math.random() * 16) + 5;
        int m = (int) (Math.random() * 16) + 5;

        arrayOne = new int[n];
        arrayTwo = new int[m];

        arrayThree = new int[arrayOne.length + arrayTwo.length];

        arrayOne[0] = (int) (Math.random() * (50 + 1)) - 25;
        for (int i = 1; i < arrayOne.length; i++) {
            arrayOne[i] += arrayOne[i - 1] + 2;
        }

        arrayTwo[0] = (int) (Math.random() * (60 + 1)) - 30;
        for (int i = 1; i < arrayTwo.length; i++) {
            arrayTwo[i] = arrayTwo[i - 1] + 3;
        }

        System.out.println("Первая последовательность (размер " + n + "):");
        System.out.println(Arrays.toString(arrayOne));
        System.out.println("Вторая последовательность (размер " + m + "):");
        System.out.println(Arrays.toString(arrayTwo));

        int i;
        int j;

        i = 0;
        j = 0;

        while ((i + j) < arrayThree.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                arrayThree[i + j] = arrayOne[i];
                i++;
            } else if (arrayTwo[j] < arrayOne[i]) {
                arrayThree[i + j] = arrayTwo[j];
                j++;
            } else if (arrayOne[i] == arrayTwo[j]) {
                arrayThree[i + j] = arrayOne[i];
                i++;
                arrayThree[i + j] = arrayTwo[j];
                j++;
            }
            if ((j == arrayTwo.length) && (i != arrayOne.length)) {
                do {
                    arrayThree[i + j] = arrayOne[i];
                    i++;
                } while (i != arrayOne.length);

            } else if ((i == arrayOne.length) && (j != arrayTwo.length)) {
                do {
                    arrayThree[i + j] = arrayTwo[j];
                    j++;
                } while (j != arrayTwo.length);

            }

        }
        System.out.println();
        System.out.println("Новая последовательность:");
        System.out.println(Arrays.toString(arrayThree));
    }
}
