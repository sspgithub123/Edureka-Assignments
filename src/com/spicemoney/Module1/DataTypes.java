package com.spicemoney.Module1;

public class DataTypes {
    public static void main(String[] args) {
        int a = 12;
        int b = 34;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = b/a;
        float remainder = b%a;


        System.out.println("sum of 12 and 34 is: " + sum);
        System.out.println("sub of 12 and 34 is: " + sub);
        System.out.println("mul of 12 and 34 is: " + mul);
        System.out.println("div of 34 and 12 is: " + div);
        System.out.println("remainder of 34 and 12 is: " + remainder);


        int x = 10;
        b = x++;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);
        b = ++x;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);

        int y = 10;
        b = y--;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);
        b = --y;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);


    }
}
