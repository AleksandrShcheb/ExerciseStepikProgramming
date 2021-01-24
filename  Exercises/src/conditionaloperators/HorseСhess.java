package conditionaloperators;

import java.util.Scanner;

/*
    Даны две различные клетки шахматной доски. Напишите программу,  которая определяет, может ли конь
    попасть с первой клетки на вторую одним ходом. Программа получает на вход четыре числа от 1 до 8 каждое,
    задающие номер столбца и номер строки сначала для первой клетки, потом для второй клетки.
    Программа должна вывести «YES», если из первой клетки
    ходом коня можно попасть во вторую или «NO» в противном случае.
 */

class HorseChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1, x2, y1, y2;

        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();

        int xy1 = y1 - x1;
        int xy2 = y2 - x2;

        if (( Math.abs(xy1)  == Math.abs(1) && Math.abs(xy2)  == Math.abs(2)) || (Math.abs(xy1)  == Math.abs(2) &&
                Math.abs(xy2)  == Math.abs(1))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

