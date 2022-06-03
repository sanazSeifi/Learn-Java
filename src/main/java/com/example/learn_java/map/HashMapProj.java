package com.example.learn_java.map;
import java.util.HashMap;

public class HashMapProj {
    public static void main(String[] args){
        HashMap<String, Integer> empIds =  new HashMap<>();
        empIds.put("John", 1234);
        empIds.put("Carl", 568);
        empIds.put("Sanaz", 3997);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Sanaz"));
        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(1234));
        empIds.put("John" , 4586);
        System.out.println(empIds.get("John"));

        empIds.put("Sevil", 283);
        System.out.println(empIds.containsValue(283));

        empIds.replace("Carl", 347);
        System.out.println(empIds);

        empIds.replace("Kam", 4587);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 4560);
        System.out.println(empIds);

        empIds.remove(4586);
        System.out.println(empIds);
    }
}
