package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы
8. Дана последовательность целых чисел a1, a2,..., an. Образовать новую последовательность, выбросив
из исходной те члены, которые равны min(a1, a2,..., an)
*/

public class Array8 {

    public static void main(String[] args) {

        int[] array;
        int min;
        int count;
        int[] newArray;

        array = new int[]{-1, 2, 0, 2, 3, 8, -4, -4, 3, -4, 5, 11, 185, 20, -4, 5, 6, 4, -4, 33};
        min = Integer.MAX_VALUE;
        count = 0;

        System.out.println("Последовательность: " + Arrays.toString(array));

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        for (int num : array) {
            if (num == min) {
                count++;
            }
        }

        newArray = new int[array.length - count];

        count = 0;
        for (int num : array) {
            if (num == min) {
                continue;
            }

            newArray[count] = num;
            count++;
        }

        System.out.println("Новая последовательность: " + Arrays.toString(newArray));

    }
}
