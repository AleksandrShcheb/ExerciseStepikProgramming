package datatypes;

import java.util.Scanner;

/*
    Найти расстояние между двумя точками с заданными координатами (x1,y1)(x2,y2)
 */

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1,x2,y1,y2;

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double answer = Math.sqrt(Math.pow((x2 - x1),2) + (Math.pow((y2 - y1),2)));

        System.out.println(answer);
    }
}

