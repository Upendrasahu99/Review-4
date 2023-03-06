//

package com.bridgelabz;

import jdk.jshell.spi.SPIResolutionException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];
        int[] primeNumberArray = new int[input.length];


        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        int index = 0;

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            if (input[i] > 1) {
                for (int j = 2; j < input[i]; j++) {
                    if (input[i] % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    primeNumberArray[index] = input[i];
                    index++;

                }
            }
        }
        for (int i = 0; i < primeNumberArray.length; i++) {
            for (int j = i + 1; j < primeNumberArray.length; j++) {
                if (primeNumberArray[i] == primeNumberArray[j]) {
                    primeNumberArray[j] = 0;
                }
            }
        }
        Arrays.sort(primeNumberArray);
        for (int k : primeNumberArray) {
            System.out.println(k);
        }
    }
}
