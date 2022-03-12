package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
*/

public class Decomposition15 {

    public static void main(String[] args) {

        int n;

        n = (int) (Math.random() * (4)) + 2;

        System.out.printf("%d-значные числа, цифры в которых образуют строго возрастающую последовательность:", n);
        System.out.println();
        printStrictlyIncreasingSequence(n);

    }

    private static void printStrictlyIncreasingSequence(int n) {

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            if (checkNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean checkNumber(int num) {

        int digit;
        int prevDigit;

        while (num != 0) {

            digit = num % 10;
            num /= 10;
            prevDigit = num % 10;

            if (prevDigit >= digit) {
                return false;
            }
        }
        return true;
    }
}
