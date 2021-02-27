package loops;

import java.util.Scanner;

/*
    Напишите программу, которая считывает натуральное число n и выводит первые n чисел последовательности Фибоначчи.
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = 1;
        int n2 = 0;

        int n = scanner.nextInt();
        System.out.print(1);

        if (n > 1) {

            for (int i = 0; i < n - 1; i++) {

                int sum = n1 + n2;
                System.out.print(" " + sum);
                n2 = n1;
                n1 = sum;

            }
        }

    }
}



