package datatypes;

import java.util.Scanner;

/*
    По данному целому числу, найдите его квадрат.
 */

public class SquareDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();
        System.out.println((int) Math.pow(digit, 2));
    }
}

