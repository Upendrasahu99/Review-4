//A program to count the character of string.


package com.bridgelabz;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String input");
        String input = scanner.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (alphabet.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(alphabet.charAt(i) + " come " + count + " time");
            }
        }
    }
}
