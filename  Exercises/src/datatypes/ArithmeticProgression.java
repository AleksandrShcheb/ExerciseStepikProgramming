package datatypes;

import java.util.Scanner;

/*
    Арифметической прогрессией называется последовательность чисел a1,a2,an, каждое из которых, начиная с a2,
    получается из предыдущего прибавлением к нему одного и того же постоянного числа d(разность прогрессии), то есть:

    an = an-1 + d. Если известен первый член прогрессии и ее разность, то nn-ый член арифметической прогрессии
    находится по формуле: an = a1 + d * (n-1)

    Входные данные:
    Программа получает на вход натуральные числа a1,d и n, каждое из которых не превышает 10000

    Выходные данные:
    Выведите n-ый член арифметический прогрессии.

 */

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1, d, n;

        a1 = scanner.nextInt();
        d = scanner.nextInt();
        n = scanner.nextInt();

        int an = a1 + d * (n-1);

        System.out.println(an);
    }
}

