package loops;

import java.util.Scanner;

/*
    Напишите программу, которая выводит звездный треугольник в соответствии с примером.
 */

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i >= 0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}

