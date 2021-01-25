package conditionaloperators;

import java.util.Scanner;

/*
    Даны действительные числа a,b,c.  Найдите все решения квадратного уравнения ax^2 + bx + c = 0
 */

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        a= scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double d = Math.pow(b,2) - 4 * a * c;

        double x1,x2;

         x1 = (-b - Math.sqrt(d)) / (2 * a);
         x2 = (-b + Math.sqrt(d)) / (2 * a);

        if (d == 0) {
            System.out.println((-b / (2*a)));
        }
        else if (d > 0) {
            System.out.println(Math.min(x1,x2));
            System.out.println(Math.max(x1,x2));
        }
    }
}

