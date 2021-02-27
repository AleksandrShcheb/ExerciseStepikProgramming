package loops;

import java.util.Scanner;

/*

    Даны два натуральных числа m и n (m <=n). Напишите программу, которая выводит все числа от m до n включительно
    удовлетворяющие хотя бы одному из условий:

    число кратно 17;
    число оканчивается на 9;
    число кратно 3 и 5 одновременно.
    Формат входных данных
    На вход программе подаются два натуральных числа m и n (m<=n), каждое на отдельной строке.

    Формат выходных данных
    Программа должна вывести числа в соответствии с условием задачи.

    Примечание. Если чисел удовлетворяющих условию нет, выводить ничего не надо.
 */

public class SequenceOfNumbersFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 17 == 0) {
                System.out.println(i);
            } else if (i % 10 == 9) {
                System.out.println(i);
            }
            else if (i % 15 == 0) {
                System.out.println(i);
            }
        }
    }
}

