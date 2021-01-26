package conditionaloperators;

import java.util.Scanner;

/*
По данным сторонам треугольника, определите, существует ли невырожденный треугольник.

Вырожденный треугольник - это треугольник, у которого все три вершины лежат на одной прямой.
Все остальные треугольники называются невырожденными.


Входные данные

Даны три натуральных числа a,b,c каждое из которых не превышает 10000.



Выходные данные

Если треугольник существует, выведите строку "YES", иначе выведите строку "NO".
 */

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a < b + c && b < a+c && c < a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

