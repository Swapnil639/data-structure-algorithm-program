package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Welcome to Anagram Program ");
        Anagram anagram = new Anagram();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first String :");
        String a = scanner.next();
        System.out.print("Enter the second String :");
        String b = scanner.next();
        anagram.checkAnagram(a, b);

    }

    public void checkAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] array1 = str1.toLowerCase().toCharArray();
            char[] array2 = str2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean result = Arrays.equals(array1, array2);
            if (result == true) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Strings are not anagram");
            }
        }else
            System.out.println("Strings length are not equal");
    }
}
