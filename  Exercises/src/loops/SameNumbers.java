package loops;

import java.util.Scanner;

/*
    Дано натуральное число. Напишите программу, которая определяет, состоит ли указанное число из одинаковых цифр.
 */

public class SameNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long copyN = n;

        long ed = n % 10;

        boolean start = true;

        while (start) {
            long edCopy = copyN % 10;
            copyN /= 10;
            if (edCopy != ed) {
                System.out.println("NO");
                start = false;
            } else if (copyN == 0) {
                System.out.println("YES");
                start = false;
            }
        }

    }
}

