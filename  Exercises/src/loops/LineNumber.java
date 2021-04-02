package loops;

import java.util.Scanner;

/*
    По данной последовательности строк, определите какой по счету встретится строка.
 */

public class LineNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        boolean flag = true;
        int count = 0;

        while (flag){
            String str2 = scanner.next();
            count++;
            if (str.equals(str2)){
                System.out.println(count);
                flag= false;
            }
        }

    }


}

