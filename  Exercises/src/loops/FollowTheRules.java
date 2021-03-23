package loops;

import java.util.Scanner;

/*
    На вход программе подается натуральное число n.
    Напишите программу, которая выводит числа от 1 до n
    включительно за исключением:

    чисел от 5 до 9 включительно;
    чисел от 17 до 37 включительно;
    чисел от 78 до 87 включительно.
 */

public class FollowTheRules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            if ((i >= 5 && i <=9) || (i >=17 && i<= 37) || (i>=78 && i <= 87))  {

                continue;
            }
            System.out.println(i);
        }
    }
}

