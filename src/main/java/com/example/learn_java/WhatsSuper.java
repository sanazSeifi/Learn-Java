package com.example.learn_java;

 class WhatsSuper{
    int maxSpeed =120;
}
class Car extends WhatsSuper{
     int maxSpeed = 100;
     public void display(){
         System.out.println(maxSpeed);
     }
}
