package loops;

import java.util.Scanner;

/*
    По данному числу n, найдите произведение четных чисел от 1 до n.
 */

public class MultiOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int multi = 1;
        for (int i = 1 ; i <=n ; i++) {
            if (i %2==0) {
                multi *=i;
            }
        }
        System.out.println(multi);
    }
}

