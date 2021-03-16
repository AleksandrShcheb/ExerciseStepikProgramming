package loops;

import java.util.Scanner;

/*

 */

public class Spam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = " ";

        while(true) {
            str = scanner.next();
            if (str.equals("КОНЕЦ")) {
                break;
            }




            System.out.println(str);
        }
    }
}

