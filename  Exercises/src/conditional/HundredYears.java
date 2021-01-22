package conditional;

import java.util.Scanner;

/*
    Напишите программу, которая определяет, оканчивается ли год с данным номером на два нуля. Если год оканчивается,
    то выведите «YES», иначе выведите «NO».
 */

public class HundredYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year % 100 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

