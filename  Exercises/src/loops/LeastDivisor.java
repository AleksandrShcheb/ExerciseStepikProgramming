package loops;

import java.util.Scanner;

/*
    На вход программе подается число n >. Напишите программу,
    которая выводит его наименьший отличный от 1 делитель.
 */

public class LeastDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

