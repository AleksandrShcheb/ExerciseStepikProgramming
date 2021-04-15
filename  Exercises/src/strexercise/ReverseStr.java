package strexercise;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();



        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
