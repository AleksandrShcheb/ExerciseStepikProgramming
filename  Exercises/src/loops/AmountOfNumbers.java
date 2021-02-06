package loops;

import java.util.Scanner;

/*
    По данным числам, определите количество чисел, оканчивающиеся на 0.
 */

public class AmountOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =- 0;
        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            int input = scanner.nextInt();
            if (input % 10==0 ) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

