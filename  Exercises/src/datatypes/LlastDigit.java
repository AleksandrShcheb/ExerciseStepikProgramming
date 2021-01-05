package datatypes;

import java.util.Scanner;

/*
    Дано натуральное число, выведите его последнюю цифру.
 */

public class LlastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        n = n % 10;

        System.out.println(n);
    }
}

