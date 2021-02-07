package loops;

import java.util.Scanner;

/*
На вход программе подается натуральное число n.

Напишите программу, которая печатает звездный прямоугольник размерами n * 19
 */

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("*******************");

        }

    }
}

