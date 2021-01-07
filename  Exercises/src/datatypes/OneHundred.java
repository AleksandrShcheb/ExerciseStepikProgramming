package datatypes;

import java.util.Scanner;

/*
    Дано натуральное целое число. Найдите число сотен(то есть третью справа цифру).
 */

public class OneHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n / 100 % 10);
    }
}



