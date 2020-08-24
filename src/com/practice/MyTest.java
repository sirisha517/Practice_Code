package com.practice;


import java.io.IOException;

class Derived1
{
    String s = "kishore";
    Integer i;
    Derived1(){


    }
   public  void display(){
        System.out.println("String: " + s );
        //String s = "kalempudi";
       System.out.println("output: " + s);
    }
    public static void main(String[] args) {
        new Derived1();
        Derived1 derived1 =new Derived1();
       derived1.display();

       
    }
}




