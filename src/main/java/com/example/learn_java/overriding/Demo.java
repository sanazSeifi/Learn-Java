package com.example.learn_java.overriding;

public class Demo {
    public static void main(String[] args){
        Person p = new Person("Bob", 21);
        Student s = new Student("Mary", 19, 34762);
        System.out.println();
        p.display();
        s.display();
    }
}
