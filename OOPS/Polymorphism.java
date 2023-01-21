/*

polymorphism -> many forms

1. Compile time(early binding)
    -> Method overloading

        1. changing the number of argument.
        2. changing the data type of argument
        
2. Run time (Late binding)
    -> Method overriding

 */

class Test{

    void add()
    {
        System.out.println("Add");
    }
    void add(int x)
    {
        System.out.println("Add " + x);
    }

    // void add(int x,int y)
    // {
    //     System.out.println("2 Add "+ (x+y));
    // }

    void add(long x,long y)
    {
        System.out.println("2 Long "+ (x+y));
    }

    void add(float c , float d)
    {
        System.out.println("Float Add " + (c+d));
    }

    // int add(int c, int d)
    // {

    // }


}



public class Polymorphism {
    public static void main(String[] args) {
        
        Test t = new Test();
        t.add();
        t.add(3,4);
        t.add(4);
        t.add(3.4f,7.6f);

    }
}
