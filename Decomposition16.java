package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
16. Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры. Определить также,
сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/

public class Decomposition16 {

    public static void main(String[] args) {

        int n;
        int sum;

        n = (int) (Math.random() * 4) + 2;

        sum = findSum(n);
        System.out.printf("Сумма искомых %d-значных чисел равна %d", n, sum);
        System.out.println();
        System.out.printf("Количество четных цифр в найденной сумме: %d", countEvenDigit(sum));

    }

    private static int countEvenDigit(int sum) {

        int count;
        int digit;

        count = 0;

        while (sum != 0) {
            digit = sum % 10;
            if ((digit & 1) == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }

    private static int findSum(int n) {

        int sum;

        sum = 0;

        for (int i = (int) Math.pow(10, n - 1); i <= (int) Math.pow(10, n) - 1; i++) {
            if (checkNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean checkNumber(int number) {

        int digit;

        while (number != 0) {
            digit = number % 10;
            number /= 10;
            if ((digit & 1) == 0) {
                return false;
            }
        }
        return true;
    }

}
