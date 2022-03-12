package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
массив, включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив
*/

public class Sorting1 {

    public static void main(String[] args) {

        int[] arrayOne;
        int[] arrayTwo;
        int[] arrayThree;
        int k;

        k = 5;
        arrayOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayTwo = new int[]{10, 11, 12, 13, 14, 15};

        arrayThree = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++) {
            if (i < k) {
                arrayThree[i] = arrayOne[i];
            }

            if (i == k) {
                arrayThree[i + arrayTwo.length] = arrayOne[i];
                for (int j = 0; j < arrayTwo.length; j++) {
                    arrayThree[i + j] = arrayTwo[j];

                }
            }

            if (i > k) {
                arrayThree[i + arrayTwo.length] = arrayOne[i];
            }

        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

    }
}
