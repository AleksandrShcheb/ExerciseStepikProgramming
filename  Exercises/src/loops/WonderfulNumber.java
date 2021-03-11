package loops;

import java.util.Scanner;

/*
    Дано натуральное число N. Определите является ли данное число замечательным. Число называется замечательным,
    если оно делится на сумму своих цифр без остатка.
 */

public class WonderfulNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        int digit =n;
        while (digit > 0) {

            sum += digit % 10;
            digit =digit/ 10;
        }
        if (n % sum == 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");


    }
}

