package datatypes;

import java.util.Scanner;

/*
    Дано трехзначное число. Переверните число и выведите.
 */

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ed = n % 10;
        int des = n / 10 % 10;
        int sot =n / 100;

        int answ = ed * 100 + des * 10 + sot;

        System.out.println(answ);

    }
}

