package datatypes;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
    Дано одно натуральное четырехзначное число. Найдите самое большое число, полученное из заданного перестановкой его цифр.
    Например, если дано число 5239. Из всех перестановок цифр наибольшим будет 9532.
 */

public class SortReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();

        int[] arrNumber = new int[4];

        arrNumber[0] = digit / 1000;
        arrNumber[1] = digit / 100 % 10;
        arrNumber[2] = digit / 10 % 10;
        arrNumber[3] = digit % 10;

        Arrays.sort(arrNumber);

        for (int i = arrNumber.length-1; i >=0 ; i--) {
            System.out.print(arrNumber[i]);
        }

    }
}

