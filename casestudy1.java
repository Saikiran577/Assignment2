package com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class casestudy1 {
    public static void main(String[] args) {
        double a=45;
        double b=20;

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter operator : ");
        char opr = Sc.next().charAt(0);
        switch (opr)
        {

            case '+':
            System.out.println("Addition : " +  (a+b));
            break;

            case '-':
                System.out.println("Subtraction : " + (a-b));
                break;

            case '*':
                System.out.println("Multiplication : " + (a*b));
                break;

            case '/':
                System.out.println("Division : " + (a/b));
                break;

            case '%':
                System.out.println("Modulus : " + (a%b));
                break;

            case 's':
                System.out.println("Sine is :" + (Math.toRadians(Math.sin(a))));
                break;
            case 'C':
                System.out.println("cos is :" +(Math.toRadians(Math.cos(a))));
                break;
            case 'T':
                System.out.println("Tan is:"+(Math.toRadians(Math.tan(a))));
                break;
           case 'O':
               System.out.println("Cot is:"+(Math.toRadians(Math.cos(a)) / (Math.toRadians(Math.sin(a)))));


        }
    }
}
