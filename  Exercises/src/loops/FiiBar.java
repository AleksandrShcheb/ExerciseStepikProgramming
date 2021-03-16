package loops;

import java.util.Scanner;

/*

 */

public class FiiBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ed =0;

        while (n != 0) {
            ed = n % 10;

            System.out.println(ed);
            n = n/10;
        }
    }
}





