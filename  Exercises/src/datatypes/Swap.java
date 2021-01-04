package datatypes;

import java.util.Scanner;

/*
    Напишите программу, которая считывает значения двух целочисленных переменных a и b, затем меняет их значения местами
    (то есть в переменной a должно быть записано то, что раньше хранилось в b, а в переменной b записано то, что раньше
    хранилось в a). Затем выведите значения переменных.
 */

class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, temp;

        a = scanner.nextInt();
        b = scanner.nextInt();

//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.printf("%d %d",a,b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}

