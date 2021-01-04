package datatypes;

import java.util.Scanner;

/*
    N школьников делят K яблок поровну, не делящийся остаток остается в корзинке. Сколько яблок останется в корзинке?
 */

public class DividingAppleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int answer = k % n;

        System.out.println(answer);
    }
}

