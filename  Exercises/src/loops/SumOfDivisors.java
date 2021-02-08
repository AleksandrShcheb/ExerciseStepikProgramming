package loops;

import java.util.Scanner;

/*
    На вход программе подается натуральное число n. Напишите программу, которая вычисляет сумму всех его делителей.

    Входные данные
    На вход программе подается натуральное число n.

    Выходные данные
    Программа должна вывести единственное число в соответствии с условием задачи.


 */

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = n; i >=1 ; i--) {
            if (n % i == 0) {
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}

