package datatypes;

import java.util.Scanner;

/*
    Дано положительное действительное число x. Выведите его дробную часть.
 */

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double digit = scanner.nextDouble();

        System.out.println(digit*10%10/10);


    }
}

