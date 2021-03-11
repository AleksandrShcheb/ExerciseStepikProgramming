package loops;

import java.util.Scanner;

/*
    По данному натуральному числу N выведите такое наименьшее целое число k ,
    что 2^k >= N
*/

public class BinaryLogarithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = 0;
        int answer = 0;

        while (answer <n){
            answer = (int)Math.pow(2,k);
            if (answer >= n) {
                break;
            }
            k++;

        }
        System.out.println(k);

    }
}

