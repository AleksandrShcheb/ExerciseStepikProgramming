package loops;

import java.util.Scanner;

/*
    По данному числу N айдите квадраты всех чисел от 1 до N включительно.
    Входные данные
    Вводится натуральное число N, не превышающее 10^4.
    Выходные данные
    Выведите квадраты чисел от 1 до N включительно.
 */

public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println((int)Math.pow(i,2));
        }
    }
}

