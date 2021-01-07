package datatypes;

import java.util.Scanner;

/*
    Даны два числа. Найти их среднее арифметическое.
 */

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextInt();
        double n2 = scanner.nextInt();

        System.out.println( (n1 + n2)/2 );
    }
}

