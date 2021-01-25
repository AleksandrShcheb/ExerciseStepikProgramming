package conditionaloperators;

import java.util.Scanner;

/*
    В некоторой школе решили набрать три новых класса и оборудовать кабинеты для них новыми партами.
    За каждой партой может сидеть два учащихся. Известно количество учащихся в каждом из трех классов.
    Выведите наименьшее число парт, которое нужно приобрести для них.

    Входные данные
    Программа получает на вход три натуральных числа: количество учащихся в каждом из трех классов.
    Каждое число не превышает 10^5

    Выходные данные
    Выведите наименьшее число парт, которое нужно приобрести для учащихся.
 */

public class SchoolDesks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble() / 2;
        double n2 = scanner.nextDouble() / 2;
        double n3 = scanner.nextDouble() / 2;

        n1 = Math.ceil(n1);
        n2 = Math.ceil(n2);
        n3 = Math.ceil(n3);

        double sumPupil = (int) n1 + n2 + n3;

        System.out.println((int) sumPupil);

    }
}

