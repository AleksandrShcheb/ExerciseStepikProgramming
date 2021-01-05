package datatypes;

import java.util.Scanner;

/*
    Дано число x. Вычислите число x^6.
 */

public class WorkingVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println((int)Math.pow(x,6));
    }
}

