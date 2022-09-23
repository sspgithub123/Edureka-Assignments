package com.spicemoney.Module1;

public class DoWhileLoops {
    public static void main(String[] args) {

        //Write a program to print 10 even numbers and 10 odd numbers
        /*
        int i = 0;
        do{
            if (i % 2 == 0) {
                System.out.print("even: " + i);
            } else
                System.out.print("\nodd: " + i + "  ");
            i++;
        }while (i < 21);

         */


        //Write a programto find factorial of a number
        /*
        int number=3;
        int factorial=1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        }while (i <= number);
        System.out.println("Factorial of "+number+" is: "+factorial);

         */


        //Write a program to generate tables of 10.
        /*
        int i = 1;
         do{
            System.out.println("Table of 10 is: " + i * 10);
            i++;
        }while (i < 11);
         */

        //Write a program to generate 10 Fibonacci numbers.
        int number1 = 0;
        int number2 = 1;
        int number3;
        int i = 0;

         do {
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
            i++;
        }while ( i <= 10);
    }
}
