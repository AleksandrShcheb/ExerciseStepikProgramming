package datatypes;

import java.util.Scanner;

/*
    Дано неотрицательное целое число. Найдите число десятков(то есть вторую справа цифру).
 */

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = n / 10 % 10;
        System.out.println(answer);
    }
}

