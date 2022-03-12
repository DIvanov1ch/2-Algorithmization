package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
9. Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы) вычисления его площади,
если угол между сторонами длиной X и Y - прямой.
*/

public class Decomposition9 {

    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int t;

        x = readFromConsole("Длина стороны X: ");
        y = readFromConsole("Длина стороны Y: ");
        z = readFromConsole("Длина стороны Z: ");
        t = readFromConsole("Длина стороны T: ");

        System.out.println("Площадь: " + areaOfQuadrilateral(x, y, z, t));
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

    public static double areaOfQuadrilateral(int a, int b, int c, int d) {

        double areaOfTriangle;
        double areaOfRightTriangle;
        double e;

        areaOfRightTriangle = a * b / 2.0;
        e = Math.sqrt(a * a + b * b);

        // формула Герона для площади треугольника по длинам его сторон:
        areaOfTriangle = Math.sqrt((c + d + e) * (d + e - c) * (c + e - d) * (c + d - e)) / 4.0;

        return areaOfRightTriangle + areaOfTriangle;

    }
}
