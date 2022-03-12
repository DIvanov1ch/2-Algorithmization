package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
4. На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, между какими из пар точек
самое большое расстояние. Указание: координаты точек занести в массив
*/

public class Decomposition4 {

    public static void main(String[] args) {

        int n;
        int[] x;
        int[] y;

        n = readFromConsole("Количество точек >> ");

        while (n < 2) {
            n = readFromConsole("Количество точек не менее двух >> ");
        }

        x = new int[n];
        y = new int[n];

        System.out.println("Введите координаты точек: ");
        for (int i = 0; i < n; i++) {
            x[i] = readFromConsole("x" + (i + 1) + " >>");
            y[i] = readFromConsole("y" + (i + 1) + " >>");

        }

        printMostDistantPoints(n, x, y);

    }

    private static void printMostDistantPoints(int n, int[] x, int[] y) {

        double maxDistance;
        int posA;
        int posB;
        double tmp;

        maxDistance = -1;
        posA = -1;
        posB = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                tmp = distanceBetweenPoints(x[i], y[i], x[j], y[j]);
                if (tmp > maxDistance) {
                    maxDistance = tmp;
                    posA = i;
                    posB = j;
                }
            }
        }

        System.out.printf("Наибольшее расстояние между (%d, %d) и (%d, %d)", x[posA], y[posA], x[posB], y[posB]);
    }

    public static int readFromConsole(String message) {

        Scanner in = new Scanner(System.in);

        System.out.println(message);
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println(message);
        }

        return in.nextInt();
    }

    public static double distanceBetweenPoints(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
