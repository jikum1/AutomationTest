package com.learn.programs;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "jitu";
        String str2 = "uijt";
        System.out.println("Response is " + checkAnagram(str1 , str2));
    }

    public static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] newStr1 = str1.toCharArray();
        char[] newStr2 = str2.toCharArray();
        Arrays.sort(newStr1);
        Arrays.sort(newStr2);
        System.out.println(newStr1);
        System.out.println(newStr2);
        return Arrays.equals(newStr1 , newStr2);
    }
}
