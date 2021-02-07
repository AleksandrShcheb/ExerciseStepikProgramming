package loops;

import java.util.Scanner;

/*
    На вход программе подается натуральное число n, а затем n целых чисел, каждое на отдельной строке.
    Напишите программу, которая подсчитывает сумму введенных чисел.

    Формат входных данных
    На вход программе подаются натуральное число n, а затем n целых чисел, каждое на отдельной строке.

    Формат выходных данных
    Программа должна вывести сумму данных чисел.
 */

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum =0;

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();

            sum+=input;
        }

        System.out.println(sum);
    }
}

