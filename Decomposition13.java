package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
13. Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
напечатать все пары "близнецов" из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения задачи
использовать декомпозицию
*/

public class Decomposition13 {

    public static void main(String[] args) {

        int n;
        int[] interval;

        n = (int) (Math.random() * (800 + 1)) + 3;
        interval = new int[2 * n - n + 1];

        for (int i = 0; i < interval.length; i++) {
            interval[i] = n + i;
        }

        System.out.println("Интервал: ");
        System.out.println("[" + n + ", " + 2 * n + "]");
        System.out.println("Числа-близнецы: ");
        printTwinNumbers(interval);

    }

    private static void printTwinNumbers(int[] interval) {

        boolean primeNumber;
        boolean nextPrimeNumber;

        for (int i = 0; i < interval.length - 2; i++) {
            if ((interval[i] & 1) == 1) {
                primeNumber = checkPrimeNumber(interval[i]);
                nextPrimeNumber = checkPrimeNumber(interval[i + 2]);
                if (primeNumber && nextPrimeNumber) {
                    System.out.print("(" + interval[i] + ", " + interval[i + 2] + "), ");
                }
            }
        }
    }

    // Перебор делителей
    private static boolean checkPrimeNumber(int number) {

        int maxDivider;

        maxDivider = (int) Math.sqrt(number);

        for (int j = 3; j <= maxDivider; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
