package com.bridgelabz;

import java.util.Scanner;

public class Permutation {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String string = scanner.next();
        String answer = " ";
        permutationMethod(string, answer);
        System.out.println("Total possibility ways are : " + count);
    }

    public static void permutationMethod(String string, String answer) {
        if (string.length() == 0) {
            System.out.println(answer + " ");
            count++;
        }
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            String left = string.substring(0, i);
            String right = string.substring(i + 1);
            String rest = left + right;
            permutationMethod(rest, answer + ch);
        }
    }
}
