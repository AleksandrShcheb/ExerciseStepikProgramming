package conditional;

import java.util.Scanner;

/*
    Даны пять чисел a1,a2,a3,a4,a5. Напишите программу, которая вычисляет сумму их модулей
    |a1| + |a2| + |a3| + |a4| + |a5|.
 */

public class AbsAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a1,a2,a3,a4,a5;

        a1 = scanner.nextDouble();
        a2 = scanner.nextDouble();
        a3 = scanner.nextDouble();
        a4 = scanner.nextDouble();
        a5 = scanner.nextDouble();

        double answer = Math.abs(a1) + Math.abs(a2) + Math.abs(a3) + Math.abs(a4) + Math.abs(a5);

        System.out.println(Math.abs(answer));

    }
}

