package conditionaloperators;

import java.util.Scanner;

/*
    По данному натуральному числу, определите является ли его последняя цифра четной.
 */

public class LastDigitEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();

        if (digit % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

