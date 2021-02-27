package loops;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
    Даны два целых числа m и n. Напишите программу, которая выводит все числа от m до n включительно в порядке
    возрастания, если m<n, или в порядке убывания в противном случае.
 */

public class SequenceOfNumbersTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        if (n>m) {
            for (int i = m; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = m; i >= n; i--) {
                System.out.println(i);
            }
        }



    }
}

