package com.example.learn_java;

public class Classase {
    public static void main(String[] args){
        var textBox1 = new Text_Box();
        var textBox2 = new Text_Box();

        textBox1.setText("Box 1");
        textBox2.setText("Box 2");
        System.out.println(textBox1.text.toUpperCase());
        System.out.println(textBox2.text.toLowerCase());
    }
}
