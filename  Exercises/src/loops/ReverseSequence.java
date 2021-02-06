package loops;

import java.util.Scanner;

/*
    Выведите обратную последовательность чисел на отрезке от a до b.
    Входные данные
    Вводятся целые числа a и b. Гарантируется, что a не превосходит b (a<=b) . Каждое из чисел по модулю не превышает 30000
    Выходные данные
    Выведите на каждой строке все целые числа от b до a включительно.
 */

public class ReverseSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (int i = b; i >= a ; i--) {
            System.out.println(i);
        }
    }
}

