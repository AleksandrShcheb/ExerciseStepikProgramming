package datatypes;

import java.util.Scanner;

/*
    Напишите программу, которая находит сумму и произведение трёх целых чисел, введённых с клавиатуры.
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int digitOne = scanner.nextInt();
        int digitTwo = scanner.nextInt();
        int digitThree = scanner.nextInt();

        int sum = digitOne + digitTwo + digitThree;
        int multi = digitOne * digitTwo * digitThree;

        System.out.println(sum + " " + multi);

    }
}

