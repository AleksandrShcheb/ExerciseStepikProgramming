package strexercise;

import java.util.Scanner;

/*
    Даны названия трех городов. Напишите программу, которая определяет самое короткое и самое длинное название города.
 */

public class ThreeCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city1 = scanner.next();
        String city2 = scanner.next();
        String city3 = scanner.next();

        int c1  = city1.length();
        int c2  = city2.length();
        int c3  = city3.length();

        int min = Math.min(Math.min(c1,c2),c3);
        int max = Math.max(Math.max(c1,c2),c3);

        System.out.println(min);
        System.out.println(max);
    }
}

