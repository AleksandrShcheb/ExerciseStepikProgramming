package loops;

import java.util.Scanner;

/*
Выведите количество натуральных делителей числа x, включая 1 и само число.

Входные данные
Вводится натуральное число x, не превышающее 2*10^5.

Выходные данные
Выведите количество натуральных делителей числа x, включая 1 и само число.
 */

public class Dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum =0;

        for (int i = 1; i <=x ; i++) {
            if (x % i == 0 ) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

