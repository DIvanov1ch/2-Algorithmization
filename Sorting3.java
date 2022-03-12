package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
3. Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить элементы так, чтобы
они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и
ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором
*/

public class Sorting3 {

    public static void main(String[] args) {

        int[] array;
        int pos;
        int max;

        array = new int[]{-15, -12, -10, -8, -8, -5, 0, 3, 6, 6, 9, 12, 15, 18};

        for (int i = 0; i < array.length; i++) {
            pos = i;
            max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    pos = j;
                }

            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = max;
            }

        }

        System.out.println(Arrays.toString(array));
    }
}
