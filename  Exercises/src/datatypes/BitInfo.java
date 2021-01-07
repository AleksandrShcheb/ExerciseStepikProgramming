package datatypes;

import java.util.Scanner;

/*
    Как мы знаем из курса информатики, минимальной единицей измерения количества информации является бит.
    Но есть также и другие единицы измерения, которые служат для записи большого количества информации.
    На рисунке представлены все единицы и соответствия между всеми единицами
 */

public class BitInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double digit = scanner.nextDouble();

        System.out.println(digit / Math.pow(2,13) );
    }
}

