package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
6. Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class Decomposition6 {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        int numberThree;

        numberOne = readFromConsole("1-е число: ");
        numberTwo = readFromConsole("2-е число: ");
        numberThree = readFromConsole("3-е число: ");

        boolean prime = checkRelativelyPrimeNumbers(numberOne, numberTwo, numberThree);

        if (prime) {
            System.out.println("Взаимно простые числа");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    public static boolean checkRelativelyPrimeNumbers(int num1, int num2, int num3) {
        return gcd(gcd(num1, num2), num3) == 1;
    }

    public static int readFromConsole(String string) {

        Scanner scan = new Scanner(System.in);

        System.out.println(string);
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println(string);
        }

        return scan.nextInt();
    }

    public static int gcd(int x, int y) {

        int max;
        int min;
        int tmp;

        max = Math.max(x, y);
        min = Math.min(x, y);

        while (min != 0) {
            tmp = max % min;
            max = min;
            min = tmp;
        }

        return max;
    }
}
