package datatypes;

import java.util.Scanner;

/*
    N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок достанется каждому школьнику?

Формат входных данных
На вход дается два целых положительных числа NN и KK, каждое из которых не превышает 10000
 */

public class DividingApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = k / n;

        System.out.println(result);

    }
}



