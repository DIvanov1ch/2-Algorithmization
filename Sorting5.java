package by.epam.trukhanovich.algorithmization;

import java.util.Arrays;

/*
Одномерные массивы. Сортировки
5. Сортировка вставками. Дана последовательность чисел a1, a2,..., an. Требуется переставить числа в пордке возрастания
Делается это следующим образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т.е. a1<=a2<=...<=ai.
Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая последовательность была тоже
возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
Двоичный поиск оформить в виде отдельной функции
*/

public class Sorting5 {

    public static void main(String[] args) {

        int[] array;
        int tmp;
        int pos;

        array = new int[]{-5, -4, -3, -2, 0, -6, 10, 4, 3, -1, 2, 1, 7, 5, 6, 9, 8};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            pos = binarySearch(array, array[i], i);

            if (pos != i) {
                tmp = array[i];
                for (int j = i; j > pos; j--) {
                    array[j] = array[j - 1];
                }
                array[pos] = tmp;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(array));

    }

    public static int binarySearch(int[] array, int number, int i) {
        int first;
        int last;
        int middle;
        int pos;

        first = 0;
        last = i;
        pos = -1;

        while (first <= last) {
            middle = (first + last) / 2;

            if (array[middle] < number) {
                first = middle + 1;
                if (first > last) {
                    pos = first;
                }
            } else if (array[middle] > number) {
                last = middle - 1;
                if (last < first) {
                    pos = first;
                }
            } else {
                return middle;
            }

        }
        return pos;
    }
}
