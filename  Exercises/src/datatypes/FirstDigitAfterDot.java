package datatypes;

import java.util.Scanner;

/*
    Дано положительное действительное число x. Выведите его первую цифру после десятичной точки.
 */

public class FirstDigitAfterDot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        n =n * 10;

        int digit = (int)n % 10;
        System.out.println(digit);
    }
}

