package loops;

import java.util.Scanner;

/*
    На вход программе подается последовательность целых чисел от 1 до 5, характеризующее оценку ученика,
    каждое число на отдельной строке. Концом последовательности является любое отрицательное число, либо число большее 5.
    Напишите программу, которая выводит количество пятерок.
 */

public class CountFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;

        while (n <= 5 && n >= 0) {
            if (n == 5) {
                count++;
            }

            n = scanner.nextInt();
        }

        System.out.println(count);
    }
}

