package loops;

import java.math.BigDecimal;
import java.util.Scanner;

/*
    На вход программе подается число n >. Напишите программу,
    которая выводит его наименьший отличный от 1 делитель.
 */

public class LeastDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();


        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int answer = i;
                System.out.println(answer);
                break;
            }
        }

    }
}

