package datatypes;

import java.util.Scanner;

/*
    n школьников делят k яблок "поровну”, то есть так, чтобы количество яблок, доставшихся любым двум школьникам,
    отличалось бы не более, чем на 1.

 */

public class DividingAppleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k;

        n = scanner.nextInt();
        k = scanner.nextInt();

        if (k % n == 0) {
            System.out.println(0);
        } else{
            System.out.println(n-(k % n));
        }



    }
}

