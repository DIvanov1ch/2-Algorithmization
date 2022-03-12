package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов
*/

public class Array3 {

    public static void main(String[] args) {

        int n = 15;
        double[] array = new double[n];

        int positive;
        int negative;
        int zero;

        positive = 0;
        negative = 0;
        zero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (30 + 1)) - 15;
            System.out.print(array[i] + ", ");
        }

        for (double num : array) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println();
        System.out.println("Количество отрицательных элементов: " + negative);
        System.out.println("Количество положительных элементов: " + positive);
        System.out.println("Количество нулевых элементов: " + zero);

    }
}
