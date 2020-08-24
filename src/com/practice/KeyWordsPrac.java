package com.practice;

public class KeyWordsPrac {
    public static void main(String[] args) {
        ContinueCheck();

    }
    public static void ContinueCheck(){
        int [] a = {10,20,30,40,50,30,70,80,90};
        for(int x:a){
            if(x==30)
                break;
            System.out.println("x value: " + x);

        }

    }
}
