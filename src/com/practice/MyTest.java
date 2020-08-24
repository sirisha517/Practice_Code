package com.practice;


import java.io.IOException;

class Derived1
{
    String s ;
    Integer i;
    Derived1(){


    }
   public static void display(String s){
       // System.out.println("String: " + s );
        //String s = "kalempudi";
       System.out.println("output: " + s);
    }
    public static void main(String[] args) {
        new Derived1().display("kallempudi");
       /* Derived1 derived1 =new Derived1();
       derived1.display();*/
        Derived1.display("kishore");

    }
}




