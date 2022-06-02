package com.example.learn_java.overriding;

public class Person {
    public String name;
    public int age;

    public void display(){
        System.out.println(name + " is " + age + " years old");
    }

    public Person(){
        name = "Unknown name";
        age =0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

