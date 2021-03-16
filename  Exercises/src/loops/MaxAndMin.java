package loops;

import java.util.Scanner;

/*
    Дано натуральное число n, n>= 10. Напишите программу,
    которая определяет его максимальную и минимальную цифры.
 */

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;
        int min = n;

        while (n !=0) {
            int ed = n % 10;
             max = Math.max(max, ed);
             min = Math.min(min, ed);
             n /= 10;

        }
        System.out.println("Максимальная цифра равна " + max);
        System.out.println("Минимальная цифра равна " +  min);
    }
}

