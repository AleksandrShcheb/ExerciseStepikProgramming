package loops;

import java.util.Scanner;


/*
Среди натуральных чисел от 1 до N(включая N),
найдите число, наибольшее по сумме цифр. Вывести это число и сумму его цифр.
*/
public class MaximumSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        int digit = 0;

        int max = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = i; j != 0 ; j/=10) {
                sum = j % 10;

                if (sum > max ){
                    max = sum;
                    digit = i;
                }
            }
        }

        System.out.println(digit + " " + max);
    }

}
