package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
1. Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
чисел:
      НОК(А,В) = (А * В) / НОД(А,В)
*/

public class Decomposition1 {

    public static void main(String[] args) {

        int a;
        int b;

        a = readFromConsole("Number \'A\':");
        b = readFromConsole("Number \'B\':");

        System.out.println("lcm(" + a + ", " + b + ") = " + leastCommonMultiple(a, b));

        System.out.println("gcd(" + a + ", " + b + ") = " + greatestCommonDivisor(a, b));

    }

    public static int readFromConsole(String message) {

        Scanner scan = new Scanner(System.in);

        System.out.println(message);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println(message);
        }

        return scan.nextInt();

    }

    public static int leastCommonMultiple(int a, int b) {

        int max;
        int min;
        int lcm;

        max = Math.max(a, b);
        min = Math.min(a, b);
        lcm = max;

        if ((a == 0) || (b == 0)) {
            return 0;
        }

        while (lcm % min != 0) {
            lcm += max;
        }

        return lcm;
    }

    public static int greatestCommonDivisor(int a, int b) {

        int max;
        int min;

        if (a == 0 || b == 0) {
            return a + b;
        } else {
            max = Math.max(a, b);
            min = Math.min(a, b);
            return greatestCommonDivisor(max % min, min);
        }
    }


}
