package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы
4. Даны действительные числа a1, a2,..., an. Поменять местами наибольший и наименьший элементы.
*/

public class Array4 {

    public static void main(String[] args) {

        double[] array;

        array = new double[]{-5.2, 2, 0, -8.2, 2.8, 22, 66, 58, -100, 10.6, 63.9, 15, 0, 12.3};

        System.out.println("Массив до замены: " + Arrays.toString(array));

        double min;
        double max;
        int iMin;
        int iMax;

        min = Double.MAX_VALUE;
        max = Double.MIN_VALUE;
        iMin = 0;
        iMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                iMin = i;
            } else if (array[i] > max) {
                max = array[i];
                iMax = i;
            }
        }

        if (iMin != iMax) {
            array[iMin] = max;
            array[iMax] = min;
        }

        System.out.println("Массив после замены: " + Arrays.toString(array));

    }
}
