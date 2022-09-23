package com.spicemoney.Module1;

public class ForLoops {
    public static void main(String[] args) {

        //Write a program to generate tables of 10.
        /*
        for (int i = 1; i < 11; i++) {
            System.out.println("Table of 10 is: " + i * 10);
        }
        */


        //Write a program to reverse the digits of a number.
        int a =1234;
        int reverse = 0;

        for (;a != 0; a=a/10) {
            int remainder = a % 10;
            reverse = reverse * 10 + remainder;

        }
        System.out.println("The reverse number of 1234 is: " + reverse);


        //Write a programto add the digits of a number.
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of numbers is: " + sum);


        //Write a program to print 10 even numbers and 10 odd numbers.
        for (int i = 1; i < 21; i++) {
             if(i%2==0){
                 System.out.print("even: "+i);
             }else
            System.out.print("\nodd: "+i+ "  ");
        }


        //Write a program to generate 10 Fibonacci numbers.
        int number1 = 0;
        int number2 = 1;
        int number3;

        for (int i = 0; i <= 10; i++) {
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }

        //Write a programto find factorial of a number
        int number=4;
        int factorial=1;

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+number+" is: "+factorial);
    }
}
