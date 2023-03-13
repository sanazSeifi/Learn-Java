package com.example.learn_java;

public class Text_Box {
    //Attribute:
    public  String text="";

    //method:
    public void setText(String text){
        this.text = text + " " + text;
    }

    //another method:
    public  void clear(){
        text = "";
    }
}
