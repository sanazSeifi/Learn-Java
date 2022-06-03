package com.example.learn_java.Arrays;


public class ArrayListProj {
    public static void main(String[] args){
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);

        ArrayListProj fruitList = new ArrayListProj();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        System.out.println(fruitList);
    }

    private void add(String mango) {
    }
}