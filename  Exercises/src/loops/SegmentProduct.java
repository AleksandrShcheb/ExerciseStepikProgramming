package loops;

import java.util.Scanner;

/*
    По данным двум целым числа a и b, вычислите произведение чисел на отрезке от a до b.
 */

public class SegmentProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int multi = 1;

        for (int i = a; i <=b ; i++) {
            multi*=i;
        }

        System.out.println(multi);
    }
}

