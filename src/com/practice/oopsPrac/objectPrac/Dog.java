package com.practice.oopsPrac.objectPrac;

public  class Dog
{
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

   /* public Dog(){

    }*/
    // Constructor Declaration of Class
    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
       /* this.age = age;
        this.color = color;*/
    }


    // method 1
    public String getName()
    {
        return name;
    }

    // method 2
    public String getBreed()
    {
        return breed;
    }

    // method 3
    public int getAge()
    {
        return age;
    }

    // method 4
    public String getColor()
    {
        return color;
    }


    /*@Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
                ".\nMy breed,age and color are " +
                this.getBreed()+"," + this.getAge()+
                ","+ this.getColor());
    }*/

    public static void main(String[] args)
    {
        Dog tuffy = new Dog("siri","kishu");

      /*  tuffy.setName("siri");
        tuffy.setBreed("kishu");
        tuffy.setAge(30);
        tuffy.setColor("kallempudi");*/
        System.out.println(tuffy.toString());
       // System.out.println(tuffy.breed);

    }
}
