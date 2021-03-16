package loops;

import java.util.Scanner;

/*
    Последовательность состоит из целых чисел и завершается числом 0. Определите разность количества положительных и отрицательных чисел последовательности.

    Входные данные

    Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит). Числа по модулю не превышают 1000.

    Выходные данные

    Выведите разность количества положительных и количества отрицательных чисел, то есть результат операции "количество положительных чисел" минус "количество отрицательных чисел".
 */

public class DifferenceBetweenPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int countPos = 0;
        int countNeg = 0;

        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                countPos++;
            } if (n < 0){
                countNeg++;
            }

            if (n == 0) {
                break;
            }
        }
        System.out.println(countPos - countNeg);
    }
}

