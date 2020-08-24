package com.practice.oopsPrac.objectPrac;

    class ReferenceObject{
        int id;
        String name;
    }
    class TestStudent2{
        public static void main(String args[]){
            ReferenceObject referenceObject=new ReferenceObject();
            referenceObject.id=101;
            referenceObject.name="Sonoo";
            System.out.println(referenceObject.id+" "+referenceObject.name);//printing members with a white space
        }
    }

