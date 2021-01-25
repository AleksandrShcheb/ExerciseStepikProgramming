package conditionaloperators;

import java.util.Scanner;

/*
Дано четырехзначное число. Определите, является ли его запись симметричной.
Число называется симметричным, если оно одинаково читается справа налево и слева направо.

Формат входных данных
Вводится натуральное число, не большее 9999.

Формат выходных данных
Выведите "YES", если число симметричное,  иначе "NO".
 */

public class SymmetricNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n / 1000 == n % 10 && n / 10 % 10 == n / 100 % 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

