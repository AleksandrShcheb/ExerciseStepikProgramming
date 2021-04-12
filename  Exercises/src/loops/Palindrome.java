package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int copyN = n;
        int dig = 0;

        while (n !=0){
            dig = dig * 10 + n % 10;
            n/=10;
        }
        if (dig - copyN == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
