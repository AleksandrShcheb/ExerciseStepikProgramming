package loops;

import java.util.Scanner;

/*
    Дано натуральное число N.
    Выведите его представление в двоичном виде в обратном порядке.
 */

public class ReverseBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n > 0){
            System.out.println(n%2);
            n/=2;
        }
    }
}

