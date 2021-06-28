package com.learn.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacters {

    public static void main(String args[]){
        String str = "abbdcc";
        System.out.println(findFirstUniqueCharacter(str));
    }

    public static char findFirstUniqueCharacter(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        char ch='\0';
        for(int  i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if(map.size()>0 && map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(Character val : map.keySet()){
            if(map.get(val) == 1){
                return val;
            }
        }
        return ch;
    }
}
