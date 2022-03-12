package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
2. Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел
*/

public class Decomposition2 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        a = readFromConsole("1-е число >> ");
        b = readFromConsole("2-е число >> ");
        c = readFromConsole("3-е число >> ");
        d = readFromConsole("4-е число >> ");

        System.out.println("gcd(" + a + "," + b + "," + c + "," + d + ") = " + gcd(gcd(gcd(a, b), c), d));


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
