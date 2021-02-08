package loops;

import java.util.Scanner;

/*
    На вход программе подаются два целых числа a и b (a<=b). Напишите программу, которая подсчитывает количество
    чисел в диапазоне от a до b включительно, куб которых оканчивается на 4 или 9.
 */

public class AmountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (Math.pow(i, 3) % 10 == 4 || Math.pow(i, 3) % 10 == 9) {
                count++;
            }
        }

        System.out.println(count);

    }
}

