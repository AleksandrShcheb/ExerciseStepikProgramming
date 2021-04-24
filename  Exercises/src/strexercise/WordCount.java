package strexercise;

import java.util.Scanner;

/*
 *   Дана строка, содержащая пробелы. Найдите, сколько в ней слов.
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] s = str.split(" ");

        System.out.println(s.length);
    }
}
