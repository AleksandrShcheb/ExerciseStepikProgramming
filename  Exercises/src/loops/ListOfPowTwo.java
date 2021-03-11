package loops;

import java.util.Scanner;

/*
    По данному числу N распечатайте все целые степени двойки,
    не превосходящие N.

    Операцией возведения в степень пользоваться нельзя!

    Входные данные
    Вводится натуральное число N, не превышающее 10^6.

    Выходные данные
    Выведите все целые степени двойки, не превосходящие N,
    в порядке возрастания.

    __________
    50 -> 1    2    4    8    16    32

*/

public class ListOfPowTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int digit = 1;
        int answer = 1;

        while (answer <= n) {
            System.out.println(answer);

            answer = answer * 2;


        }

    }
}

