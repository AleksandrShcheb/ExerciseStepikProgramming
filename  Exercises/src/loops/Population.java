package loops;

import java.util.Scanner;

/*
На вход программе подается три натуральных числа m,p,n:

m: стартовое количество организмов;
p: среднесуточное увеличение в %;
n: количество дней для размножения.
Напишите программу, которая предсказывает размер популяции организмов. Программа должна выводить размер
популяции в каждый день, начиная с 1 и заканчивая n-днем.

Формат входных данных
На вход программе подается три натуральных числа.

Формат выходных данных
Программа должна вывести текст в соответствии с условием задачи.
 */

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m, p, n;
        double answer = 0;
        m = scanner.nextDouble();
        p = scanner.nextDouble();
        n = scanner.nextDouble();
        for (int i = 0; i < n; i++) {
            answer = m * Math.pow(p / 100 + 1, i);
            System.out.println(i + 1 + " " + answer);
        }
    }
}

