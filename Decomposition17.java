package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

public class Decomposition17 {

    public static void main(String[] args) {

        int number;

        number = (int) (Math.random() * (100 + 1)) + 100;

        System.out.println(number);
        System.out.println(countOperations(number));

    }

    private static int countOperations(int number) {

        int count;

        count = 0;

        while (number != 0) {
            number -= findSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int findSumOfDigits(int number) {

        int sum;

        sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
