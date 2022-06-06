package com.example.learn_java.Multi_Thread;

public class MultiThread {
public static void main(String[] args){
    MultiThreadThings myThing = new MultiThreadThings();
    MultiThreadThings myThing2 = new MultiThreadThings();
    myThing.run();
    myThing2.run();
}
}
