package by.epam.trukhanovich.algorithmization;

import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
11. Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.
*/

public class Decomposition11 {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        numberOne = readFromConsole("Первое число: ");
        numberTwo = readFromConsole("Второе число: ");

        checkNumbers(numberOne, numberTwo);

    }

    private static int readFromConsole(String message) {

        Scanner in = new Scanner(System.in);

        System.out.println(message);
        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println(message);
        }
        return in.nextInt();
    }

    private static void checkNumbers(int numOne, int numTwo) {

        if (numberOfDigits(numOne) > numberOfDigits(numTwo)) {
            System.out.println("В первом числе больше цифр");
        } else if (numberOfDigits(numOne) < numberOfDigits(numTwo)) {
            System.out.println("Во втором числе больше цифр");
        } else {
            System.out.println("Количество цифр одинаково");
        }
    }

    private static int numberOfDigits(int number) {

        int count;

        if (number == 0) {
            return 1;
        } else {
            count = 0;
            while (number != 0) {
                count++;
                number /= 10;
            }
            return count;
        }

    }
}
