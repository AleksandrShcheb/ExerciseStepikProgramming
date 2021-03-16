package loops;

import java.util.Scanner;

/*
    Напишите программу, которая вычисляет НОД двух чисел.
 */

public class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,i;

        a = scanner.nextInt();
        b = scanner.nextInt();

        i = 1;
        int answer = 0;
        while (i<= Math.max(a,b)){

            if ((a % i == 0) && (b % i == 0)) {
                answer = i;
            }
            i++;

        }

        System.out.println(answer);
    }
}

