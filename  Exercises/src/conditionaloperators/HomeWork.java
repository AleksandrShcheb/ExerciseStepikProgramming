package conditionaloperators;

import java.util.Scanner;

/*
    Васе задали домашнее задание сделать k задач. За день Вася успевает сделать m задач.
    Сколько дней нужно, чтобы Вася сделал домашнее задание?

    Входные данные
    Программа получает на вход числа k и m, каждое из которых не превышает 1000.

    Выходные данные
    Выведите ответ на задачу.
 */

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();

        if (k % m == 0) {
            System.out.println(k / m);
        } else System.out.println(k / m + 1);


    }
}

