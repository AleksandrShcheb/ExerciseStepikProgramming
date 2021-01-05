package datatypes;

import java.util.Scanner;

/*
    Дано трехзначное число. Найдите сумму его цифр.
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;


        while (n > 0) {
            int des = n % 10;
            sum += des;
            n /= 10;
        }

        System.out.println(sum);

    }
}

