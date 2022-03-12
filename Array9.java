package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее их них.
*/

public class Array9 {

    public static void main(String[] args) {

        int[] array;
        int time;
        int count;
        int min;

        array = new int[]{-1, -2, -3, 4, 0, 1, 2, -3, 4};

        time = 0;
        min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (count == time) {
                min = Math.min(min, array[i]);

            } else if (count > time) {
                min = array[i];
                time = count;
            }

        }

        if (min != Integer.MAX_VALUE) {
            System.out.println("Наиболее часто встречающееся число: " + min);
        }

    }
}
