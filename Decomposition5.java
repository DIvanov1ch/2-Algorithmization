package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Декомпозиция с использованием методов (подпрограммы)
5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
меньше максимального элемента массива, но больше всех других элементов).
*/

public class Decomposition5 {

    public static void main(String[] args) {

        int[] array;
        int n;
        int max;

        n = 10;
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (50 + 1)) - 25;

        }

        max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(Arrays.toString(array));
        if (max != Integer.MIN_VALUE) {
            System.out.println("Искомое число: " + theNumber(array, max));
        }
    }

    public static int theNumber(int[] array, int max) {

        int number;

        number = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > number && num < max) {
                number = num;
            }
        }

        return number;
    }
}
