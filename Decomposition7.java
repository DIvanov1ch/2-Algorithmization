package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
7. Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class Decomposition7 {

    public static void main(String[] args) {

        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна " + sumOfFactorials());

    }

    public static int sumOfFactorials() {
        int sum = 0;
        int factorial = 1;

        for (int i = 1; i < 10; i ++) {
            factorial *= i;
            if ((i & 1) == 1) {
                sum += factorial;
            }

        }
        return sum;
    }
}
