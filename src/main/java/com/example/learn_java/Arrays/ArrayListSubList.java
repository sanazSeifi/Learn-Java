package com.example.learn_java.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {

    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ram");
        arrayList.add("Dave");
        arrayList.add("Peter");
        arrayList.add("Julia");
        arrayList.add("Akram");

        System.out.println("ArrayList : " +  arrayList + "\n");
        List<String> subList = arrayList.subList(0,3);
        System.out.println("SubList : " + subList + "\n");
    }
}
