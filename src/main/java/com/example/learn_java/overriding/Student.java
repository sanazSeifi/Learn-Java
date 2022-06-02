package com.example.learn_java.overriding;

public class Student  extends Person{
    private int studentId;
    public void display(){
       super.display();
        System.out.println("SID : " + studentId);
    }
    public Student(){
        super();
        studentId = 0;
    }

    public Student(String name, int age, int studentId){
        super(name,studentId);
        this.studentId =studentId;
    }

}
