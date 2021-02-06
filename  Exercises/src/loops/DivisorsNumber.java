package loops;

import java.util.Scanner;

/*
    По данному натуральному числу x, выведите все его делители.

    Входные данные
    Вводится натуральное число x.
 */

public class DivisorsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 1; i <= x ; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }
}

