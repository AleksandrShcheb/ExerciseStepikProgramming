package loops;

import java.util.Scanner;

/*
    По данным двум целым числам a и b, вычислите произведение чисел на отрезке от a до b, оканчивающихся на 7.
    Выведите произведение чисел на отрезке от a до b, оканчивающихся на 7. Или само число, если оно единственное.
 */

public class ProductOfNumbersEndingInSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int multiplication = 1;

        for (int i = a; i <= b; i++) {

            if (Math.abs(i) % 10 == 7) {
                multiplication *= i;
            }
        }

        System.out.println( multiplication);
    }
}

