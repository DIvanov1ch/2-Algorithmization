package by.epam.trukhanovich.algorithmization;

/*
Одномерные массивы
5. Даны целые числа a1, a2,..., an. Вывести на печать только те числа, для которых ai > i.
*/

public class Array5 {

    public static void main(String[] args) {

        int[] array;

        array = new int[]{1, 0, -1, 5, 6, -5, 9, -15, 25, 1, 2, 3, -52, 0, 12};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
