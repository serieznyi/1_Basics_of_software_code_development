package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

public class Task3 {

    public static void main(String @NotNull [] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.printf("Сумма квадратов первых ста чисел равна %s\n", sum);
    }
}
