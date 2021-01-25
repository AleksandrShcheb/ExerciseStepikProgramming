package strexercise;

import java.util.Scanner;

/*
    Будем считать email адрес корректным, если в нем есть символ собачки (@) и точки.
    Напишите программу проверяющую корректность email адреса.

    Формат входных данных
    На вход программе подаётся одна строка – email адрес.

    Формат выходных данных
    Программа должна вывести строку «YES», если email адрес является корректным и «NO» в ином случае.

    Примечание. Наличие символов @ и . недостаточно для корректности email адреса, однако их отсутствие
    гарантировано влечёт за собой неверный email.
 */

public class CorrectEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.next();

        if ((email.contains("@")) && (email.contains(".")) ) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}

