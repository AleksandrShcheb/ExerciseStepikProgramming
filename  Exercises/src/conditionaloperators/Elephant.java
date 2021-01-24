package conditionaloperators;

import java.util.Scanner;

/*
    Даны две различные клетки шахматной доски. Напишите программу, которая определяет, может ли слон попасть с
    первой клетки на вторую одним ходом. Программа получает на вход четыре числа от 1 до 8 каждое, задающие
    номер столбца и номер строки сначала для первой клетки, потом для второй клетки.
    Программа должна вывести «YES», если из первой клетки ходом слона можно попасть во вторую или «NO» в противном случае.

    Формат входных данных
    На вход программе подаётся четыре числа от 1 до 8.

    Формат выходных данных
    Программа должна вывести текст в соответствии с условием задачи.
 */

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int xy1 = y1 - x1;
        int xy2 = y2 - x2;

        if (Math.abs(xy1) == Math.abs(xy2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

