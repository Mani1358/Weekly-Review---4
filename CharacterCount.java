package com.Java.weeklyreview4;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        String str = null;
        int[] count = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count characters:");
        str = sc.next();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            int ch = (int) str.charAt(i);
            count[ch - 97] = count[ch - 97] + 1;

        }

        for (int i = 0; i < count.length; i++) {
            int totalcount = count[i];

            if (totalcount > 0) {
                char ch = (char) (97 + i);
                System.out.println(ch + "--" + totalcount);
            }
        }

    }
}
