package loops;

import java.util.Scanner;

/*
    Дано натуральное число n(n>9). Напишите программу, которая определяет его вторую (с начала) цифру.
 */

public class SecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int secondDigit =0;

        while (n > 9){
            secondDigit = n % 10;
            n = n/10;

        }

        System.out.println(secondDigit);
    }
}

