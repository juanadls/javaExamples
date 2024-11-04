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

        //While loop
        int number = 1;

        while (number <= 5 ){
            //Code to be executed repeatedly
            // as long as the condition is true
            System.out.println(number);
            number++;

        }

        //For loop
        for (int i = 1; i <= 5; i ++ ){
            //Code to be executed repeatedly a finite times

            System.out.println(i);

        }

        for (int i = 0; i  <= 10; i++ ){
            if (i == 4){
                break;
            }

            System.out.println(i);
        }

        for (int i = 0; i  <= 10; i++ ){
            if (i == 4){
                continue;
            }

            System.out.println(i);
        }

        // Arrays are used to store multiple values of the same data type in a single variable.
        // are index by index.
        // Structure:
        // dataType [] arrayName = new dataType [arraySize]

        int[] numbers = new int[5];
        //storing values in the array: index
        numbers[0] = 10;
        numbers[1] = 20;

        //Accessing elements in the array and printing them
        System.out.println("Element at index 0:" + numbers[0]);



    }
}



