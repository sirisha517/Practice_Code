package com.practice.controlStatements;

public class IfElseTernaryExample {
    public static void test(int a){
        String output = (a%2==0)?"even number":"odd number";
        System.out.println("number is : "+output);

    }
    public static void main(String[] args) {
        test(1);
    }
}
