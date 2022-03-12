package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы. Сортировки
8. Даны дроби p1/q1, p2/q2,..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби
к общему знаменателю и упорядочивает их в порядке возрастания
*/

public class Sorting8 {

    public static void main(String[] args) {

        int[] numerator;
        int[] denominator;
        int length;

        length = (int) (Math.random() * (5 + 1)) + 5;

        numerator = new int[length];
        denominator = new int[length];

        for (int i = 0; i < numerator.length; i++) {
            numerator[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < denominator.length; i++) {
            denominator[i] = (int) (Math.random() * (10 + 1)) + 5;
        }

        System.out.println("Исходная последовательность:");
        for (int i = 0; i < length; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + ", ");

        }

        int min;
        int max;
        int lcm;

        min = denominator[0];
        max = denominator[0];
        lcm = denominator[0];

        for (int i = 0; i < denominator.length; i++) {

            if (denominator[i] > lcm) {
                max = denominator[i];
                lcm = max;
            } else {
                min = denominator[i];
                max = lcm;
            }

            while (lcm % min != 0) {
                lcm += max;
            }
        }

        System.out.println("\nОбщий знаменатель: " + lcm);

        // Корректировка числителей
        for (int i = 0; i < length; i++) {
            numerator[i] = numerator[i] * (lcm / denominator[i]);

        }

        //Сортировка
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (numerator[j] < numerator[j - 1]) {
                    int tmp = numerator[j];
                    numerator[j] = numerator[j - 1];
                    numerator[j - 1] = tmp;
                }

            }

        }

        System.out.println("Итоговая последовательность:");
        for (int i = 0; i < length; i++) {
            System.out.print(numerator[i] + "/" + lcm + ", ");

        }
    }

}
