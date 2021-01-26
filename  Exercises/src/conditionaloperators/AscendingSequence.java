package conditionaloperators;

import java.util.Scanner;

/*
    По данному трехзначному числу, определите образуют ли цифры данного числа возрастающую последовательность.
    Формат входных данных
    На вход дается натуральное трехзначное число N.
    Формат выходных данных
    Выведите "YES", если цифры числа N  образуют возрастающую последовательность, в противном случае - "NO".
 */

public class AscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ed = n % 10;
        int des = n /10 % 10;
        int sot = n / 100 % 10;

        if (sot< des && des < ed) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

