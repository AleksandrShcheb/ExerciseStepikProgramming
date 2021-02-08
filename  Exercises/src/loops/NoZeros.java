package loops;

import java.util.Scanner;

/*
    Напишите программу, которая считывает 10 чисел и выводит произведение отличных от нуля чисел.

    Формат входных данных
    На вход программе подаются 10 целых чисел, каждое на отдельной строке.

    Формат выходных данных
    Программа должна вывести произведение отличных от нуля чисел.

    Примечание. Гарантируется, что хотя бы одно из 10 чисел является ненулевым.
 */

public class NoZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multi = 1;
        int inp =0;

        for (int i = 0; i < 10; i++) {
            inp = scanner.nextInt();
            if (inp != 0) {
                multi*=inp;
            }
        }

        System.out.println(multi);
    }
}

