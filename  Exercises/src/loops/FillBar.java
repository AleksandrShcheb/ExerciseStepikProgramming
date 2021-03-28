package loops;

import java.util.Scanner;

/*

 */

public class FillBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " + "  + j + " = " + (i+j));
            }
        }
    }
}








