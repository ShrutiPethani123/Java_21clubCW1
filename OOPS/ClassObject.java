// package OOPS;

/*
OOPs  -> object oriented Programming System (c++ , JAVA)
POPs -> Procedure oriented Programming System (C , c++)


Features of OOPS

-> Encapsulation
-> Abstraction
-> Polymorphism
-> Inheritance
-> class
-> object


 */

class Car{

    int wheel=4;
    String color;

    void run()
    {
        System.out.println("Running...");
    }
}

public class ClassObject {

    public static void main(String[] args) {

        Car bmw = new Car();
        System.out.println(bmw.wheel);
        bmw.color="White";
        System.out.println(bmw.color);

        Car farari = new Car();
        System.out.println(farari.wheel);
        farari.color="black";
        System.out.println(farari.color);
    }
    
}
