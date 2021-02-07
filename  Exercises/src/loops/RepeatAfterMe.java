package loops;

import java.util.Scanner;

/*
    Дано предложение и количество раз которое его надо повторить.
    Напишите программу, которая повторяет данное предложение нужное количество раз.
 */

public class RepeatAfterMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}

