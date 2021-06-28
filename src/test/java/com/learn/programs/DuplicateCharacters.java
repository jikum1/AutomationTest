package com.learn.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharacters {


    public static void main(String args[]){
        duplicate("akanksha");
    }

    public static void duplicate(String str){
        char ch[] = str.toCharArray();
        Map<Character, Integer> map  = new HashMap<>();
        for(int i=0; i< ch.length; i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i]) + 1);
            }else{
                map.put(ch[i],1);
            }
        }

        //Iterate using HashMap
        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Character, Integer> entry = itr.next();
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

        }

    }

}
