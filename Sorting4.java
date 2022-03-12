package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
4. Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа ai и a(i+1). Если аi>a(i+1), то делается перестановка. Так продолжается
до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки,
подсчитывая при этом количество перестановок
*/

public class Sorting4 {

    public static void main(String[] args) {

        int[] array;
        int count;
        int tmp;

        array = new int[]{0, 5, -10, 12, 6, 18, -11, 4, 6, 0, 9, 7, 12, 25, -50, -65};

        count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    count++;
                }

            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Количество перестановок: " + count);

    }
}
