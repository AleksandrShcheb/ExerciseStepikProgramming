package datatypes;

import java.util.Arrays;
import java.util.Scanner;

/*
    Дано одно натуральное четырехзначное число. Найдите самое большое число, полученное из заданного циклической
    перестановкой его цифр.
    Например, если дано число 5239. Если цифры числа сдвигать циклически(порядок цифр не меняется) вправо(можно и влево),то
    его перестановками будут числа: 9523, 3952, 2395. Из всех таких перестановок возьмем наибольшее, то есть 9523.
 */

public class CyclicPermutationsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        int max = digit;

        for (int i = 0; i < 3; i++) {
            digit = digit % 10 * 1000 + digit / 10;

            if (digit > max) {
                max = digit;
            }
        }

        System.out.println(max);

    }
}

