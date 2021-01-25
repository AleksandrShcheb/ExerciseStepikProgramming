package strexercise;

import java.util.Scanner;

/*
    Вводятся 3 строки в случайном порядке. Напишите программу, которая выясняет можно ли из длин этих строк построить
    возрастающую арифметическую прогрессию.

    Формат входных данных
    На вход программе подаются три строки, каждая на отдельной строке.

    Формат выходных данных
    Программа должна вывести строку «YES», если из длин введенных слов можно построить арифметическую прогрессию, «NO»
    в ином случае.
 */

public class ArithmeticStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = scanner.nextLine().length();
        int s2 = scanner.nextLine().length();
        int s3 = scanner.nextLine().length();

        int min = Math.min(Math.min(s1,s2),s3);
        int max = Math.max(Math.max(s1,s2),s3);
        int average = s1 + s2 + s3 - max - min;

        if (max - average == average - min) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

