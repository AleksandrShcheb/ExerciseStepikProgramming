package loops;

import java.util.Scanner;

/*
    Дано натуральное число N.
    Найдите количество четверок среди всех цифр числа N.
 */

public class CountOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int cnt = 0;
        int numb = 0;

        while (n >0){
            numb = n % 10;

            if (numb == 4) {
                cnt++;
            }
            n /=10;
        }

        System.out.println(cnt);
    }
}

