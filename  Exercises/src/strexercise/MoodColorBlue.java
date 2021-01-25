package strexercise;

import java.util.Scanner;

/*
    Напишите программу, которая считывает одну строку, после чего выводит «YES», если в введенной строке есть
    подстрока «синий» и «NO» в противном случае.
 */

public class MoodColorBlue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = scanner.nextLine();

        if (str.contains("синий")) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}

