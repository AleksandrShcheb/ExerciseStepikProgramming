package conditional;

import java.util.Scanner;

/*
    Заданы две клетки шахматной доски. Напишите программу, которая определяет имеют ли указанные клетки один цвет или нет.
    Если они покрашены в один цвет, то выведите слово «YES», а если в разные цвета — то «NO».
 */

public class ChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int xy = x1+x2 + y1 + y2;

        if (xy % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

