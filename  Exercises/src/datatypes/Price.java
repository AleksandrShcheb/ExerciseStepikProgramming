package datatypes;

import java.util.Scanner;

/*
    Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
 */

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rub, kopeyka, n;

        rub = scanner.nextInt();
        kopeyka = scanner.nextInt();
        n = scanner.nextInt();

        int answer1 = rub * n;
        int answer2 = kopeyka * n;
        int ost = 0;

        if (answer2 % 100 == 0) {
            ost = 0;
            System.out.println(answer1 + answer2/100 + " " + ost);
        } else {
            ost = answer2 % 100;
            System.out.println(answer1 + answer2/100 + " " + ost);
        }


    }
}

