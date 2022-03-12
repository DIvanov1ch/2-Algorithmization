package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы
10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями). Примечание: Дополнительный массив не использовать
*/

public class Array10 {

    public static void main(String[] args) {

        int[] array;

        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        for (int i = 0; i < array.length; i++) {
            if ((i <= array.length / 2) & ((2 * i) < array.length)) {
                array[i] = array[2 * i];
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
