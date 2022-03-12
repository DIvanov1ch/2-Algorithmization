package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенных
в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
*/

public class Decomposition14 {

    public static void main(String[] args) {

        int k;

        k = (int) (Math.random() * 1_000_000) + 2;

        System.out.println("k = " + k);
        printArmstrongNumber(k);
    }

    private static void printArmstrongNumber(int k) {

        for (int i = 1; i <= k; i++) {
            if (checkArmstrongNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean checkArmstrongNumber(int number) {

        int sum;
        int num;
        int digit;

        sum = 0;
        num = number;

        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, findNumberOfDigits(number));
            num /= 10;
        }
        return sum == number;
    }

    private static int findNumberOfDigits(int number) {

        int count;

        count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}

