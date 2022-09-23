package com.spicemoney.Module1;

public class WhileLoops {
    public static void main(String[] args) {
        //Write a program to print 10 even numbers and 10 odd numbers
        /*
            int i = 0;
            while (i < 21) {
                if (i % 2 == 0) {
                    System.out.print("even: " + i);
                } else
                    System.out.print("\nodd: " + i + "  ");
                i++;
            }

         */

        //Write a programto find factorial of a number
        /*
        int number=3;
        int factorial=1;
        int i = 1;
        while (i <= number)
        {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+factorial);

         */

        //Write a program to generate tables of 10.
        /*
        int i = 1;
        while (i < 11) {
            System.out.println("Table of 10 is: " + i * 10);
            i++;
        }
         */

        //Write a programto add the digits of a number.
        /*
        int sum = 0;
        int i = 1;
        while ( i < 11) {
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of numbers is: " + sum);
         */

        //Write a program to generate 10 Fibonacci numbers.
        int number1 = 0;
        int number2 = 1;
        int number3;
        int i = 0;

        while ( i <= 10) {
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
            i++;
        }
    }
}
