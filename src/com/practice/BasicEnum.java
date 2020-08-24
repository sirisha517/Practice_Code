package com.practice;

class Lengths{
    enum SampleLengths {SMALL, MEDIUM, LARGE}
    SampleLengths size;
}

       public class BasicEnum {
    public static void main(String[] args) {
        testEnum();

    }
    public static void testEnum(){
        Lengths lengths = new Lengths();
        lengths.size= Lengths.SampleLengths.SMALL;
        System.out.println("length:"+lengths.size);
    }
}