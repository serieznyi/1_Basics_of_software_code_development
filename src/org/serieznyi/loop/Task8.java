package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Task8 {

    public static void main(String @NotNull [] args) {
        int numberA;
        int numberB;

        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Укажите натуральное число A: ");
                numberA = scanner.nextInt();
                assertPositiveInteger(numberA);

                System.out.println("Укажите натуральное число B: ");

                numberB = scanner.nextInt();
                assertPositiveInteger(numberB);

                assertGreaterThan(numberB, numberA);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Что-то пошло не так. Попробуем снова.");

                continue;
            } catch (Throwable e) {
                System.out.println("Что-то пошло не так. Попробуем снова.");

                continue;
            }

            break;
        }

        System.out.printf("Вы указали A = %s и B = %s\n", numberA, numberB);

        System.out.println("Определяем цифры содержащиеся в обоих числах");

        Set<Character> sameDigits = new HashSet<>();

        for (char symbolFromNumberA : String.valueOf(numberA).toCharArray()) {
            for (char symbolFromNumberB : String.valueOf(numberB).toCharArray()) {
                if (symbolFromNumberA == symbolFromNumberB) {
                    sameDigits.add(symbolFromNumberA);
                }
            }
        }

        for (Character sameDigit : sameDigits) {
            System.out.print(sameDigit + " ");
        }

        if (sameDigits.isEmpty()) {
            System.out.println("Числа не имеют общих цифр");
        }
    }

    /**
     * @param expected
     * @param actual
     */
    private static void assertGreaterThan(int expected, int actual) {
        if (expected < actual) {
            throw new IllegalArgumentException(String.format("Число %s должно быть больше %s", expected, actual));
        }
    }

    private static void assertPositiveInteger(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть больше нуля");
        }
    }
}
