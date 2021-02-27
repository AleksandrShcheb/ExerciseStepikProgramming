package loops;

import java.util.Scanner;

/*
    Даны два целых числа m и n (m > n).
    Напишите программу, которая выводит все нечетные числа от m до n включительно в порядке убывания.
 */

public class SequenceOfNumbersThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i >= n ; i--) {
            if (i %2 != 0) {
                System.out.println(i);
            }
        }
    }
}

