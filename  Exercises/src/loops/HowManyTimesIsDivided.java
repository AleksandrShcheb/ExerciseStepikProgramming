package loops;

import java.util.Scanner;

/*
    Выведите сколько раз a делится на 3 нацело (без остатка).
 */

public class HowManyTimesIsDivided {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;

        while (a % 3 == 0){
            count++;
            a= a/3;
        }

        System.out.println(count);
    }
}

