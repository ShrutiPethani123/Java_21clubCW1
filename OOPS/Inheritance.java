/*

Inheritance -> 

use: code Reusability

A (parent , super , Base )
|
B (child , sub , Derived)


Types of Inheritance:

1. single level

    A
    |
    B

2. Multi level

    A
    |
    B
    |
    C

3. Multipal

    A   B
    \   /
      C

    -> not supported in java  because of Ambiguity

4. Hyrarchical

     A
    / \
   B   C

5. Hybrid

    A
    |
    B
   / \
   C  D

 */

class Parent{

    void print()
    {
        System.out.println("Parent Method");
    }

} 

class Child extends Parent{

    void msg()
    {
        System.out.println("Child Method");
    }
}

public class Inheritance {
    
    public static void main(String[] args) {
        
        Child c = new Child();
        c.msg();
        c.print();

        Parent p = new Parent();
        // p.msg();
        p.print();

        
    }
}
