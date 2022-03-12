package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами
*/

public class Array6 {

    public static void main(String[] args) {

        double[] array;
        double sum;
        int amount;

        array = new double[]{-2, 2, 0, 23, -15, 2.2, 36.2, 21.6, -55, 55.5, 123, -2, 0, 1, 3, 11, 16, 4.2};
        sum = 0;

        for (int i = 2; i < array.length; i++) {
            amount = 0;

            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    amount++;
                }
            }

            if (amount == 2) {
                sum += array[i];
            }
        }

        System.out.printf("Сумма: %.2f", sum);

    }

}
