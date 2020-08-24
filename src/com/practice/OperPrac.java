package com.practice;

public class OperPrac {
    public static void main(String[] args) {
        double b = 10.00;

      //  opeTest();
        //sumOfPreOpe(a,b);
        sumOfPostOpe(b,10);
        tiltOperator();
    }

    public static void opeTest() {

        int x ;
        int y = 10;
        int z = 3;
        x = y+z;
        /*System.out.println("x++: "+ x++);
        System.out.println("x--: "+ x--);
        System.out.println("++x: "+ ++x);
        System.out.println("--x: "+ --x);*/
        System.out.println(x);
    }
    public static void sumOperator(double a , int b){
        System.out.println("values of a: "+ a++ + ++a);
        System.out.println("value of b: "+ b++ + b++);
    }
    public static void sumOfPreOpe(double a , int b){

        sumOperator(a, b);
        System.out.println("\"values of a: "+ --a );
    }
    public static void sumOfPostOpe(double c,int e){
        sumOfPreOpe(c,e);

    }
    public static void tiltOperator(){
        int a=10;
        int b=-15;
        boolean c=true;
        boolean d=false;
        System.out.println("Tilt of a :"+ ~a);//-11 (minus of total positive value which starts from 0)
        System.out.println("Tilt of b :"+~b);//9 (positive of total minus, positive starts from 0)
        System.out.println("Tilt of c :"+!c);//false (opposite of boolean value)
        System.out.println("Tilt of d :"+!d);
    }
}