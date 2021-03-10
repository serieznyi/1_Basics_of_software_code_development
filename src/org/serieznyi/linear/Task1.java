package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    public static void main(String @NotNull [] args) {
        assertArguments(args);

        System.out.println("Пытаемся решить функцию");
        System.out.println("z = ((a - 3) * b / 2) + c");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.printf("a = %s, b = %s, c = %s\n", a, b, c);

        System.out.printf("z = ((%s - 3) * %s / 2) + %s\n", a, b, c);

        double result = ((a - 3) * b / 2) + c;

        System.out.printf("z = %s\n", result);
    }

    private static void assertArguments(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("Укажите переменные a, b и c");
        }

        for (String arg : args) {
            try {
                Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Переменные должны вещественными числами");
            }
        }
    }
}
