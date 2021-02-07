package loops;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
    Даны два целых числа m и n (m<=n). Напишите программу, которая выводит все числа от m до n включительно.
 */

public class SequenceOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        IntStream.rangeClosed(m,n).forEach(blabla->{
            System.out.println(blabla);
        });
    }
}

