package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Task4 {

    public static void main(String @NotNull [] args) {
        BigInteger bigComposition = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {
            bigComposition = bigComposition.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
        }

        System.out.printf("Произведение квадратов первых двухсот чисел равно %s\n", bigComposition);
    }
}
