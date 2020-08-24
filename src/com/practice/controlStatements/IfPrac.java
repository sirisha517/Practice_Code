package com.practice.controlStatements;

public class IfPrac {


    static void TestIf(int b) {
        if (b < 18)
            System.out.println("not eligible");
        else
            System.out.println("eligible for vote");
    }

    public static void main(String[] args) {
         int a = 20;
        TestIf(a);
    }
}
