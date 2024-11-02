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

        //Arithmetic Operators + - * / %(modulus operator, gives you the leftover of the operation)

        //Comparison operators == != > < >= =<

        //Logic operators && || !

        //Strings are objets
        String sayHello = "Hello";
        System.out.println(sayHello);

        //Concatenation of strings
        String myFriends = "My friends";
        System.out.println( sayHello + myFriends);

        //Conditionals if statement
        int ageM = 18;
        if (ageM == 18){
            System.out.println("You are an adult");
        } else if (ageM == 60) {
            System.out.println("You are an aged person");
        } else {
            System.out.println("You are a minor");
        }


        //Conditional switch statement
        int dayOfWeek = 3;

        switch (dayOfWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Default value");
        }
    }
}



