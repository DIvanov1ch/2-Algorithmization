package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Декомпозиция с использованием методов (подпрограммы)
8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение: Составить метод (методы) для вычисления суммы трех последовательно расположенных элементов массива с
номерами от k до m.
*/

public class Decomposition8 {

    public static void main(String[] args) {

        int d;
        int[] data;
        int k;

        d = (int) (Math.random() * (10 + 1)) + 5;
        data = new int[d];

        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * (30 + 1));
        }

        System.out.println(Arrays.toString(data));

        k = (int) (Math.random() * (d - 2));

        System.out.printf("Сумма элементов массива с номерами %d, %d, %d равна %d", k, k + 1, k + 2, sumOfThreeNumbers(data, k));
    }

    public static int sumOfThreeNumbers(int[] array, int k) {

        int sum;

        sum = 0;

        for (int i = k; i < k + 3; i++) {
            sum += array[i];

        }
        return sum;
    }
}
