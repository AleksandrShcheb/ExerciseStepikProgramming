package datatypes;

import java.util.Scanner;

/*
    Найти площадь круга заданного радиуса R.
 */

public class AreaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();

        System.out.println(3.14 * (r * r));
    }
}

