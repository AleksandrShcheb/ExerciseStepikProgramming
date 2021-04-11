package loops;

import java.util.Scanner;

public class FillBar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int max = 0;
        int digit = 0;

        for (int i = 1; i <= n ; i++) {
            int sum = 0;
            for (int j = i; j !=0 ; j/=10) {
                sum+=j%10;

                if (sum > max) {
                    max = sum;
                    digit = i;
                }
            }
        }

        System.out.println(digit + " " + max);

    }
}
