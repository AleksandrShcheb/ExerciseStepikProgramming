package datatypes;

import java.util.Scanner;

/*
    Найти периметр прямоугольного треугольника с заданными катетами.
 */

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.println(a + b + c);
    }
}

