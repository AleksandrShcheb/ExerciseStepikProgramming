package loops;

import java.util.Scanner;

/*
    Напишите программу, которая считывает последовательность из 10 целых чисел и определяет является ли каждое из них четным или нет.
 */

public class OnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int count =0;
        for (int i = 1; i <=10 ; i++) {
            input = scanner.nextInt();

            if (input % 2 ==0) {
                count++;
            }
        }
        if (count == 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

