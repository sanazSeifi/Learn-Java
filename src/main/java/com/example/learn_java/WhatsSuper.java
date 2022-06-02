package com.example.learn_java;

 class WhatsSuper{
     WhatsSuper(){
         System.out.println("WhatsSuper constructor");
     }
 }
class Car extends WhatsSuper{
     int maxSpeed;
     Car(int maxSpeed){
         System.out.println("Car Constructor");
         this.maxSpeed =maxSpeed;
     }

}
