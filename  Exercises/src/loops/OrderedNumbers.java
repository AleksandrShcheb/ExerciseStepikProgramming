package loops;

import java.util.Scanner;

/*
    Дано натуральное число.
    Напишите программу, которая определяет, является ли последовательность его цифр при просмотре
    справа налево упорядоченной по неубыванию.

    5321 -> YES
 */

public class OrderedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        boolean flag = false;
        long ed = n % 10;
        while (n !=0){
            long ed2 = n % 10;

            if (ed2 < ed) {
                flag = true;
            } else {
                ed = ed2;
            }

            n/=10;
        }

        if (flag == true) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}








