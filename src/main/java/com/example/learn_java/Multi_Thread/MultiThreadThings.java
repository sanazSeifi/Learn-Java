package com.example.learn_java.Multi_Thread;
public class MultiThreadThings extends Thread{
    private int threadNumber;

    public MultiThreadThings(int threadNumber){

        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i + " From Thread "  + threadNumber);
        }
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
        }
    }
}
