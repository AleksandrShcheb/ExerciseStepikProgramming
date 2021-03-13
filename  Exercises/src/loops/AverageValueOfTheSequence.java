package loops;

import java.util.Scanner;

/*
    Определите среднее арифметическое элементов последовательности,
    завершающейся числом 0. Число 0 в последовательность
    не входит. Числа, следующие за нулем, считывать не нужно.
 */

public class AverageValueOfTheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = n;
        int count = 0;

        while (n != 0) {
            n = scanner.nextInt();
            sum += n;
            count++;

        }

        System.out.println((double) sum / count);
    }
}

