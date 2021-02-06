package loops;

import java.util.Scanner;

/*
    Найдите сумму введенных чисел, которые кратны 2, но не кратны 3.
    Входные данные
    Вводится натуральное число N , а затем N чисел, каждое из которых по модулю не превышает 2 * 10^4.

 */

public class SumWithCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =- 0;
        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            int input = scanner.nextInt();
            if (input % 2==0 && input % 3 !=0) {
                sum+=input;
            }
        }
        System.out.println(sum);
    }
}

