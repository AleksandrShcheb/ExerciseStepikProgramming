package loops;

import java.util.Scanner;

/*
    Найдите количество минимальных элементов в последовательности.
 */
public class CountOfMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1000000;
        int n = scanner.nextInt();

        int input = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();

            if (input < min) {
                count = 1;
                min = input;

            } else if (min == input) {
                count++;
            }


        }
        System.out.println(count);
    }

}
