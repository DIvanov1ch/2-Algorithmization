package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

/*
Декомпозиция с использованием методов (подпрограммы)
10. Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого
являются цифры числа N.
*/

public class Decomposition10 {

    public static void main(String[] args) {

        long number;

        number = readFromConsole("Натуральное число: ");

        System.out.println(Arrays.toString(formArray(number)));
    }

    public static long readFromConsole(String string) {

        Scanner scan = new Scanner(System.in);

        System.out.println(string);
        while (!scan.hasNextLong()) {
            scan.nextLine();
            System.out.println(string);
        }

        return scan.nextLong();
    }

    public static long[] formArray(long num) {

        long[] array;

        array = new long[numberOfDigits(num)];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = num % 10;
            num /= 10;
        }

        return array;
    }

    public static int numberOfDigits(long number) {

        int count;

        count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
