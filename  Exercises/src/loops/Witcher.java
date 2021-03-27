package loops;

import java.util.Scanner;

/*
    Всем известно, что ведьмак способен одолеть любых чудовищ, однако его услуги обойдутся недешево,
    к тому же ведьмак не принимает купюры, он принимает только чеканные монеты. В мире ведьмака существуют монеты
     с номиналами 1,5,10,25.
 */

public class Witcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while (n!=0) {
            if (n >= 25) {
                n = n - 25;
                count++;
            } else if (n >= 10) {
                n = n - 10;
                count++;
            } else if (n >= 5) {
                n = n - 5;
                count++;
            }  else if (n >= 1) {
                n = n - 1;
                count++;
            }
        }

        System.out.println(count);
    }
}

