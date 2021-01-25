package conditionaloperators;

import java.util.Scanner;

/*
    Дано целое число n. Выведите следующее за ним четное число.
 */

public class NextEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if ((n + 1) % 2 != 0) {
            System.out.println(n + 2);
        } else {
            System.out.println(n + 1);
        }
    }
}

