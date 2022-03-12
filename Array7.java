package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
7. Даны действительные числа a1, a2,..., a2n. Найти max(a1 + a2n, a2 + a(2n-1),..., an + a(n+1))
*/

public class Array7 {

    public static void main(String[] args) {

        double[] array;
        double max;
        double sum;

        max = Double.MIN_VALUE;
        array = new double[]{0, 2, -5.52, 52, 6, -6, 65.2, 2, 0.98, -1, 22, 32, 25, 1, -101, 2.2};

        for (int i = 0; i < array.length / 2; i++) {

            sum = array[i] + array[array.length - 1 - i];

            if (sum > max) {
                max = sum;
            }
        }

        if (max != Double.MIN_VALUE) {
            System.out.printf("max = %.2f", max);
        } else {
            System.out.println("Неверные данные");
        }
    }
}
