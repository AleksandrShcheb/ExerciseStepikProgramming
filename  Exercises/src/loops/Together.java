package loops;

import java.util.Scanner;

/*
    Дано натуральное число. Напишите программу, которая вычисляет:

    сумму его цифр;
    количество цифр в нем;
    произведение его цифр;
    среднее арифметическое его цифр;
    его первую цифру;
    сумму его первой и последней цифры.
 */

public class Together {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        int countNumbers = 0;
        int multiNumbers = 1;
        double averageNumbers = 0;
        int firstDigit = 0;
        int sumFirstLastDigit = 0;
        int lastDigit = 0;
        int ed = 0;

        int copyDigit = n;
        lastDigit = n % 10;

        while (n != 0) {
            ed = n % 10;
            sum += ed;
            multiNumbers *= ed;
            firstDigit = ed;
            countNumbers++;
            n = n / 10;
        }

        while (copyDigit!=0){
            firstDigit = copyDigit % 10;
            copyDigit/=10;
        }

        sumFirstLastDigit = lastDigit+ firstDigit;
        averageNumbers = (double) sum / countNumbers;

        System.out.println(sum);
        System.out.println(countNumbers);
        System.out.println(multiNumbers);
        System.out.println(averageNumbers);
        System.out.println(firstDigit);
        System.out.println(sumFirstLastDigit);


    }
}

