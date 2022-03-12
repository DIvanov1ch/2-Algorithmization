package by.epam.trukhanovich.algorithmization;

/*
Декомпозиция с использованием методов (подпрограммы)
3. Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника
*/

public class Decomposition3 {

    public static void main(String[] args) {

        int a;

        a = 10;

        System.out.printf("Площадь шестиугольника со стороной %d равна %.2f", a, areaOfHexagon(a));

    }

    public static double areaOfTriangle(int a) {

        return a * a * Math.sqrt(3) / 4.0;
    }

    public static double areaOfHexagon(int x) {

        return areaOfTriangle(x) * 6;
    }

}
