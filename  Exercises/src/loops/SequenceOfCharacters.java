package loops;

import java.util.Scanner;

/*
Напишите программу, которая использует ровно три цикла for для печати следующей последовательности символов:

AAA
AAA
AAA
AAA
AAA
AAA
BBBB
BBBB
BBBB
BBBB
BBBB
E
TTTTT
TTTTT
TTTTT
TTTTT
TTTTT
TTTTT
TTTTT
TTTTT
TTTTT
G

 */

public class SequenceOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=6 ; i++) {
            System.out.println("AAA");
        }
        for (int i = 1; i <=5 ; i++) {
            System.out.println("BBBB");
        }
        System.out.println('E');
        for (int i = 1; i <=9 ; i++) {
            System.out.println("TTTTT");
        }
        System.out.println("G");
    }
}

