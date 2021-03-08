package loops;

import java.util.Scanner;

/*
    На вход программе подается натуральное число n>=2, а затем n различных натуральных чисел, каждое на отдельной строке.
    Напишите программу, которая выводит наибольшее и второе наибольшее число последовательности.
 */

public class LargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int max, preMax, inp;

        max = -1;
        preMax =-1;

        for (int i = 0; i < n; i++) {
            inp = scanner.nextInt();

            if (inp > max) {
                preMax = max;
                max = inp;

            } else if (inp > preMax) {
                preMax = inp;
            }
        }

        System.out.println(max);
        System.out.println(preMax);
    }
}










