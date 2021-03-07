package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

public class Function3 {
    public static void main(String @NotNull [] args) {
        assertArguments(args);

        System.out.println("Пытаемся решить функцию");
        System.out.println("(sin x + cos y / cos x - sin y) * tg x * y");

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.printf("x = %s, y = %s\n", x, y);

        System.out.printf("(sin %s + cos %s / cos %s - sin %s) * tg %s * %s", x, y, x, y, x, y);

        double divisible = Math.sin(x) + Math.cos(y);
        double divisor = Math.cos(x) - Math.sin(y);
        double result = divisible / divisor * Math.tan(x * y) ;

        System.out.println(result);
    }

    private static void assertArguments(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Укажите переменные x и y");
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
