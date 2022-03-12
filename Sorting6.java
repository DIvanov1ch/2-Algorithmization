package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это
следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai<=a(i+1), то продвигаются на один элемент
вперед. Если ai>a(i+1), то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм
*/

public class Sorting6 {

    public static void main(String[] args) {

        int[] array;
        int n;

        n = 20;
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 + 1)) - 50;
        }

        System.out.println("Классическая сортировка Шелла");
        System.out.println(Arrays.toString(array));

        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (array[j] > array[j + step]) {
                        int tmp = array[j + step];
                        array[j + step] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 + 1)) - 50;
        }

        System.out.println("Сортировка Шелла согласно заданию");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;

                for (int j = i; j > 0; j--) {
                    if (array[j - 1] > array[j]) {
                        tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
