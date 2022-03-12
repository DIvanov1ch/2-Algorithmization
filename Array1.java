package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
1. В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K
*/

public class Array1 {

    public static void main(String[] args) {

        int[] array;
        int k;
        int sum;

        array = new int[]{1, 5, 25, 50, 100, 99, 77, 66, 55, 323};
        k = 11;
        sum = 0;

        for (int num : array) {
            if (num % k == 0) {
                sum += num;
            }
        }

        System.out.println("Сумма: " + sum);

    }
}
