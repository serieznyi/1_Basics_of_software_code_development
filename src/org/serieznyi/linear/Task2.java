package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

public class Task2 {
    public static void main(String @NotNull [] args) {
        assertArguments(args);

        System.out.println("Пытаемся решить функцию");
        System.out.println("(b + sqr(b ^ 2 + 4 * a * c) / 2 * a ) - a ^ 3 * c + b ^ -2");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.printf("a = %s, b = %s, c = %s\n", a, b, c);

        System.out.printf(
                "(%s + sqr(%s ^ 2 + 4 * %s * %s) / 2 * %s ) - %s ^ 3 * %s + %s ^ -2\n",
                b, b, a, c, a, a, c, b
        );

        double divisible = b + Math.sqrt(Math.pow(b, 2) + (4 * a * c));
        double divisor = 2 * a;
        double result = divisible / divisor - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(result);
    }

    private static void assertArguments(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("Укажите переменные a, b и c");
        }

        for (String arg : args) {
            try {
                Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Переменные должны быть целочисленными или вещественными числами");
            }
        }
    }
}
