package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Декомпозиция с использованием методов (подпрограммы)
12. Даны натуральные числа K и N. Написать метод (методы) формирования массива A, элементами которого являются
числа, сумма цифр которых равна K и которые не больше N.
*/

public class Decomposition12 {

    public static void main(String[] args) {

        int k;
        int n;

        k = (int) (Math.random() * 20) + 1;
        n = (int) (Math.random() * 500) + 21;

        System.out.println("k = " + k);
        System.out.println("n = " + n);
        System.out.println(Arrays.toString(formArray(k, n)));

    }

    public static int findLengthOfArray(int k, int n) {

        int count;
        int sum;
        int digit;
        int num;

        count = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            num = i;
            while (num != 0) {
                digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if (sum == k) {
                count++;
            }

        }
        return count;
    }

    public static int[] formArray(int k, int n) {

        int[] a;
        int sum;
        int digit;
        int num;
        int j;

        a = new int[findLengthOfArray(k, n)];

        j = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            num = i;
            while (num != 0) {
                digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if (sum == k) {
                a[j] = i;
                j++;
            }

        }
        return a;
    }

}
