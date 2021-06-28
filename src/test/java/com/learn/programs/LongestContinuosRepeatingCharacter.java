package com.learn.programs;

import java.util.HashMap;
import java.util.Map;

public class LongestContinuosRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabbbbbbaaaabcdef";
        longestContinuosCharacter(str);
        String str1 = "aaaaaaaaaa";
       // longestContinuosCharacter(str1);
        String str2 = "aabbbbbbaaaabcdef";
        longestContinguous(str2);
        String str3 = "aaaaaaaaaa";
        longestContinguous(str3);
    }

    public static void longestContinuosCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                if(map.containsKey(str.charAt(i))){
                    if(map.get(str.charAt(i)) < count){
                        map.put(str.charAt(i),count);
                    }
                }else{
                    map.put(str.charAt(i),count);
                }
                count = 1;
            }
        }
        int max = map.get(str.charAt(0));
        char ch = '\0';
        for(Character m : map.keySet()){
            if(max <= map.get(m)){
                max = map.get(m);
                ch = m;
            }
        }
        System.out.println("Character is " + ch  + " and no of occurance is "+ max);
    }

    public static void longestContinguous(String str){
        int count = 1;
        int maxCount = 1;
        char ch = str.charAt(0);
        char newCh = str.charAt(0);

        for(int i=1; i<str.length(); i++){
            if(ch == str.charAt(i)){
                count++;
                if(maxCount<count){
                    maxCount = count;
                    newCh = ch;
                }
            }else{
                ch = str.charAt(i);
                count = 1;
            }
        }
        System.out.println("Character is " + newCh  + " and no of occurance is "+ maxCount);
    }
}
