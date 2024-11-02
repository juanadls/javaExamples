package com.example.lib;

public class MyClass {

    public static void main (String[] args){
        //Primitive data types
        int age = 25;
        byte x = 103;
        short y = 7777;
        long a = 4076509;
        float pi= 3.14F;
        double b = 2.6;
        boolean yes = true;
        char carachter = 'a';
        char symbol = '@';

        //Explicit casting
        double pi2 = 3.14;
        int numPi = (int) pi2;

        //Casting between different data types

        int myInt = 5;
        char myChar = (char) (myInt + 'a');
    }
}