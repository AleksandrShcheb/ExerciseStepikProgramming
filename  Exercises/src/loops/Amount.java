package loops;

import java.util.Scanner;

/*
    Найдите сумму введенных чисел.
    Входные данные
    Вводится натуральное число N , которое определяет количество вводимых значений. Затем, последовательно вводятся числа,
    сумму которых необходимо вычислить.
 */

public class Amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int enter = scanner.nextInt();
            sum += enter;
        }

        System.out.println(sum);
    }
}

