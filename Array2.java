package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы
2. Дана последовательность действительных чисел a1, a2,..., an. Заменить все ее члены, большие данного Z,
этим числом. Подсчитать количество замен.
*/

public class Array2 {

    public static void main(String[] args) {

        double[] array;
        int z;
        int amount;

        array = new double[]{0, -5, 3.14, 88, 61.55, -15, 1.5, 66, 101.01, -99, 223, 224};
        z = 50;
        amount = 0;

        System.out.println("Начальная последовательность: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                amount++;
            }
        }

        System.out.println("Итоговая последовательность: " + Arrays.toString(array));
        System.out.println("Количество замен: " + amount);

    }
}
