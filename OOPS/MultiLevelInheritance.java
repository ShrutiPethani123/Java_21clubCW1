/*

A
|
B
|
C

 */

class A{

    void methodA()
    {
        System.out.println("Class A Method");
    }

}
class B extends A{
    void methodB()
    {
        System.out.println("Class B Method");
    }

}
class C extends B{

    void methodC()
    {
        System.out.println("Class C Method");
    }

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.methodA();
        // obj.methodB();
        // obj.methodC();

        B obj2 = new B();
        obj2.methodA();
        obj2.methodB();
        // obj.methodC();

        C obj3 = new C();
        obj3.methodA();
        obj3.methodB();
        obj3.methodC();
    }
}

/*
           Shape
     /             \ 
    Rectangle   Circle

    -> find the area



    ->

    Create a class named 'Member' having the following members:
    Data members
    1 - Name
    2 - Age
    3 - Phone number
    4 - Address
    5 - Salary
    It also has a method named 'printSalary' which prints the salary of the members.
    Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 
    'Manager' classes have data members 'specialization' and 'department' respectively. 
    Now, assign name, age, phone number, address and salary to an employee and a manager by 
    making an object of both of these classes and print the same.


    ->
    Create a class with a method that prints "This is parent class" and its subclass with another 
    method that prints "This is child class". Now, create an object for each of the class and call
    1 - method of parent class by object of parent class
    2 - method of child class by object of child class
    3 - method of parent class by object of child class



 */