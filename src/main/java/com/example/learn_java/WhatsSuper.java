package com.example.learn_java;

 class WhatsSuper{
     int maxSpeed;
     WhatsSuper(){
         System.out.println("WhatsSuper's constructor");
     } WhatsSuper(int maxSpeed){
         System.out.println("WhatsSuper constructor");
         this.maxSpeed =maxSpeed;
     }
 }
class Car extends WhatsSuper {

    Car() {
       super();
        System.out.println("Car Constructor");

    }
}