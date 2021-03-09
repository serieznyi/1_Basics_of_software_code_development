package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Task7 {

    public static void main(String @NotNull [] args) {
        int numberM;
        int numberN;

        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Укажите начало диапазона в виде натурального числа M: ");
                numberM = scanner.nextInt();
                assertPositiveInteger(numberM);

                System.out.println("Укажите конец диапазона в виде натурального числа N: ");

                numberN = scanner.nextInt();
                assertPositiveInteger(numberN);

                assertGreaterThan(numberN, numberM);
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

        System.out.printf("Вы указали M = %s и N = %s\n", numberM, numberN);

        System.out.println("Выводим числа из указанного диапазона вместе с их делителями (кроме самого числа и единицы)");

        boolean dividerFinded = false;

        for (int i = numberM; i <= numberN; i++) {
            System.out.printf("Число %s. Делители ", i);


            for (int k = 2; k < i; k++) {
                if ((i % k) == 0){
                    dividerFinded = true;
                    System.out.print(k + ", ");
                }
            }

            if (!dividerFinded) {
                System.out.print("отсутствуют");
            }

            System.out.println();

            dividerFinded = false;
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
