package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Task5 {

    public static void main(String @NotNull [] args) {
        System.out.println("Ищем сумму членов ряда, модуль которых >= E");

        double e;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите е: ");

                e = scanner.nextDouble();
            } catch (Throwable throwable) {
                System.out.println("Что-то пошло не так. Попробуем еще раз");
                continue;
            }
            break;
        }

        int n = 1;
        double sum = 0;
        double aN;

        System.out.println("-----------");

        while(Math.abs(makeNewN(n)) >= e)
        {
            aN = makeNewN(n);
            sum += makeNewN(n);

            System.out.printf("n=%s, aN=%s\n", n, aN);

            n++;
        }

        System.out.printf("-----------\nСумма: %s\n", sum);
    }

    private static double makeNewN(int n) {
        return (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
    }
}
