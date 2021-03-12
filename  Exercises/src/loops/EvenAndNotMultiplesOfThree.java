package loops;

import java.util.Scanner;

/*
    Определите сумму элементов последовательности, которые кратны 2, но не кратны 3. Последовательность  завершается
    числом 0. Числа, следующие за нулем, считывать не нужно.
 */

public class EvenAndNotMultiplesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum =0;
        while (n !=0){

            if ((n % 2 ==0) && (n % 3 != 0)) {
                sum+=n;
            }
            n = scanner.nextInt();

        }
        System.out.println(sum);

    }
}

