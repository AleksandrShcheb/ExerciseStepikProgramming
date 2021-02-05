package conditionaloperators;

import java.util.Scanner;

/*
    На числовой прямой даны два отрезка. Напишите программу, которая находит их пересечение.
    Пересечением двух отрезков может быть:
    отрезок;
    точка;
    пустое множество.
 */

public class Segments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1, b1, a2, b2;

        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();

        if (Math.max(a1, a2) < Math.min(b1, b2)) {
            System.out.println(Math.max(a1, a2) + " " + Math.min(b1, b2));
        } else if (Math.max(a1, a2) == Math.min(b1, b2) || Math.min(a1, a2) == Math.max(b1, b2)) {
            System.out.println(Math.max(a1, a2));
        } else if (a1 != a2 && b1 != b2 && a1 != b2 && a2 != b1 && a1 != b1 && a2 != b2) {
            System.out.println("пустое множество");
        }

    }

}


