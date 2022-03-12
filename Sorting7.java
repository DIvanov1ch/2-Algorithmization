package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...bm. Требуется
указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm в первую последовательность
так, чтобы новая последовательность оставалась возрастающей.
*/

public class Sorting7 {

    public static void main(String[] args) {

        int[] arrayOne;
        int[] arrayTwo;

        int n;
        int m;

        n = (int) (Math.random() * (10 + 1)) + 5;
        m = (int) (Math.random() * (10 + 1)) + 5;

        arrayOne = new int[n];
        arrayTwo = new int[m];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * (100 + 1)) - 50;
        }

        Arrays.sort(arrayOne);
        System.out.println("Первая последовательность:\n" + Arrays.toString(arrayOne));
        System.out.println("Длина: " + arrayOne.length);

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random() * (50 + 1)) - 25;
        }

        Arrays.sort(arrayTwo);
        System.out.println("Вторая последовательность:\n" + Arrays.toString(arrayTwo));
        System.out.println("Длина: " + arrayTwo.length);

        System.out.println("Номера позиций, на которые нужно вставлять элементы второй последовательности:");

        int pos;
        int i;
        int j;

        i = 0;
        j = 0;

        while (j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                i++;
            } else if (arrayTwo[j] < arrayOne[i]) {
                pos = i + j;
                System.out.print(pos + ", ");
                j++;
            } else if (arrayOne[i] == arrayTwo[j]) {
                i++;
                pos = i + j;
                j++;
                System.out.print(pos + ", ");
            }
            if (i == arrayOne.length) {
                do {
                    pos = i + j;
                    j++;
                    System.out.print(pos + ", ");
                } while (j != arrayTwo.length);
            }

        }

    }
}
