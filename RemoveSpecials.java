package com.Java.weeklyreview4;

public class RemoveSpecials {
    public static void main(String[] args) {
        String s = "Mani@kanta56%#";
        String newString = s.replaceAll("[^a-zA-Z0-9]+","");
        System.out.println("new string:" + newString);
    }
}
