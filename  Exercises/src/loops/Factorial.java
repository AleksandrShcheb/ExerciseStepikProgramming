package loops;

import java.util.Scanner;

/*
    По данному натуральному числу, найдите его факториал. (число не превосходит 12)
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}

