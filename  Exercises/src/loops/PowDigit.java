package loops;

import java.util.Scanner;

/*
На вход программе подается натуральное число n. Напишите программу, которая для каждого из чисел от 0 до n (включительно)
выводит фразу: «Квадрат числа [число] равен [число]» (без кавычек).
 */

public class PowDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i <= n ; i++) {
            System.out.println("Квадрат числа " + i + " равен " + i*i );
        }
    }
}

