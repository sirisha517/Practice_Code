package com.practice;

public class PracExce {
    public  static byte test(){
         int a = 10;
         byte b = (byte)a;
        return b;
    }
    public static void main(String args[]){
        test();
    System.out.println("values of b "+test());
    }
}
