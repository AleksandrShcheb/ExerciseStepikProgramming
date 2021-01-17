package conditional;

import java.util.Scanner;

/*
    Назовем число интересным, если в нем разность максимальной и минимальной цифры равняется средней по величине цифре.
    Напишите программу, которая определяет интересное число или нет. Если число интересное, следует
    вывести – «Число интересное» иначе «Число неинтересное».

    Формат входных данных
    На вход программе подается целое трехзначное число.

    Формат выходных данных
    Программа должна вывести текст в соответствии с условием задачи.
 */

public class InterestingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ed = n % 10;
        int des = n / 10 % 10;
        int sot = n / 100 % 10;

        int min = Math.min(Math.min(ed,des),sot);
        int max = Math.max(Math.max(ed,des),sot);
        int average = ed + des + sot - max - min;

        if (max - min == average) {
            System.out.println("Число интересное");
        } else {
            System.out.println("Число неинтересное");
        }

    }
}

