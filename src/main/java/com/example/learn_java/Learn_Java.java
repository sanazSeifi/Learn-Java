package com.example.learn_java;

public class Learn_Java {

    public static void main(String[] args){
        String massage = greetUser("Sanaz" , "Seifi");
        System.out.println(massage);

    }

    public static String greetUser(String name, String lastName){
        return  "Hello " + name + " "+ lastName;

    }
}
