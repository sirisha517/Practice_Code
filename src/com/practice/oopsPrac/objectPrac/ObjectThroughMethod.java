package com.practice.oopsPrac.objectPrac;

public class ObjectThroughMethod {
        int rollno;
        String name;
        void insertRecord(int r, String n){
            rollno=r;
            name=n;
        }
        void displayInformation(){
            System.out.println(rollno+" "+name);}
    }
    class TestStudent4{
        public static void main(String args[]){
            ObjectThroughMethod objectThroughMethod=new ObjectThroughMethod();
            ObjectThroughMethod objectThroughMethod1=new ObjectThroughMethod();
            objectThroughMethod.insertRecord(111,"Karan");
            objectThroughMethod1.insertRecord(222,"Aryan");
            objectThroughMethod.displayInformation();
            objectThroughMethod1.displayInformation();
        }
    }
