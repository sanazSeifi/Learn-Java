package com.example.learn_java.map;
import java.util.HashMap;

public class HashMapProj {
    public static void main(String[] args){
        HashMap<String, Integer> empIds =  new HashMap<>();
        empIds.put("John", 1234);
        empIds.put("Carl", 568);
        empIds.put("sanaz", 3997);

        System.out.println(empIds);
    }
}
