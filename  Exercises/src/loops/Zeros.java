package loops;

import java.util.Scanner;

/*
    По данным числам, определите наличие нуля среди них.
 */

public class Zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int box = 0;

        for (int i = 1; i <= n; i++) {
            int input = scanner.nextInt();

            if (input == 0) {
                box++;
            }
        }
        if (box == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}



