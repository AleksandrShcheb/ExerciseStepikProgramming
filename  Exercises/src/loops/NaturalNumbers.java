package loops;

import java.util.Scanner;

/*
    Дано натуральное число. Вывести на экран все натуральные числа до заданного включительно.
 */

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i =1; i <= a; i++){
            System.out.println(i);
        }

    }
}

