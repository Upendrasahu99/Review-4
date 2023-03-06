// Write a program to remove all special character from a string.

package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "[^A-Za-z0-9]";
        String input2 = input.replaceAll(regex, "");
        input = input2;
        System.out.println(input);
    }
}
