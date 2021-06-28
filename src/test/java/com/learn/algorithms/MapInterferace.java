package com.learn.algorithms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterferace {

    public static void main(String args[]){

        HashMap<String,String> map = new HashMap<>();

        //put() - Add a new key in the map
        map.put("name","jitendra");
        map.put("age","18");
        map.put("dob","21/07/2021");


        HashMap<String,String> map1 = new HashMap<>();

        //put() - Add a new key in the map
        map1.put("name","jitendra");
        map1.put("dob","21/07/2021");
        map1.put("age","18");

        System.out.println("@@@@@@@@@@@@ Map @@@@@@@@ " + map.equals(map1));
        //size() - Returns the size of the map
        System.out.println("Size of the HashMap " + map.size());

        //containsKey() - Returns boolean - true if key is found
        System.out.println("Maps containsKey age = " + map.containsKey("age"));

        //containsValue() - Returns boolean - true if value is found
        System.out.println("Maps containsValue age = " + map.containsValue("jitendra"));

        //remove() - removes the key from the map
        map.remove("age");
        System.out.println("Size of the HashMap " + map.size());

        //isEmpty() - returns boolean - true is the map is empty
        System.out.println("isEmpty() on the map is " +  map.isEmpty());

        HashMap<String,String> mapNew = new HashMap<>();
        mapNew.put("goal","consistency");
        mapNew.put("name",null);
        mapNew.put(null,"jitendra");
        mapNew.put("","");

        System.out.println("Size of the new HashMap is "  + mapNew.size());

        //equals() - compare two maps are equal or not - returns true if true
        System.out.println("Compare two maps with each other " + map.equals(mapNew));

        //hashCode() -> Returns the hashCode for the map
        System.out.println("Get hashCode " + map.hashCode());

        for(String key : map.keySet()){
            System.out.println("Key is " + key + " value is " + map.get(key));
        }

        //Using entrySet to print the content of the HashMap
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name","kumar");
        linkedHashMap.put("age","");
        linkedHashMap.put(null,"j");

        System.out.println("Size of the linkedHashMap is " + linkedHashMap.size());

        //LinkedHashMap is same as the HasHMap only difference is that it maintains
        // the insertion order.

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //Hash Table
        Hashtable<String, String> htable =  new Hashtable<>();
        htable.put("name","name1");
        htable.put("age","age1");
        htable.put("table",null);
        System.out.println("Size of the table " + htable.size());

        Hashtable<String, String> htable2 =  new Hashtable<>();
        htable2.putAll(htable);
        System.out.println("Size of the table " + htable2.size());

    }
}
