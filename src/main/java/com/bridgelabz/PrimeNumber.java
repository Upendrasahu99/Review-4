//Write a program to find all prime number from an array and sort it before print all prime number.

package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];
        int count = 0;
        for (int i = 0; i < input.length; i++) {

            input[i] = scanner.nextInt();

            for (int j = 2; j <= input[i]; j++) {
                if (input[i] != 0 && input[i] != 1 && input[i] % j != 0) {
                    count++;
                }
            }

        }

    }
}