package com.example.learn_java.Multi_Thread;

public class MultiThread {
public static void main(String[] args){

    for(int i = 0; i<= 5; i++) {
        MultiThreadThings myThing = new MultiThreadThings(i);
        Thread myThread = new Thread(myThing);
        myThread.start();
        myThread.isAlive();
        System.out.println(myThread.isAlive());
        try {
            try {
                myThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println(myThread.isAlive());
        }
        }

    }

}
