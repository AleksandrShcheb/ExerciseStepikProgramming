package datatypes;

import java.util.Scanner;

/*
    Дано натуральное число. Найдите сумму последних трех цифр.
 */

public class SumThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();

        int ed = digit % 10;
        int des = digit / 10 % 10;
        int sot = digit / 100 % 10;

        System.out.println(ed + des + sot);
    }
}

