package strexercise;

import java.util.Scanner;

/*
    Напишите программу, которая считывает с клавиатуры название футбольной команды и выводит фразу:

    «Футбольная команда [введённая строка] имеет длину [длина введённой строки] символов».

    Формат входных данных
    На вход программе подаётся строка – название футбольной команды.

    Формат выходных данных
    Программа должна вывести текст в соответствии с условием задачи.
 */

public class FootballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();

        int number= team.length();

        System.out.println("Футбольная команда " + team + " имеет длину " + number + " символов" );
    }
}

