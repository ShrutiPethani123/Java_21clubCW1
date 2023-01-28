/*

->Run Time Polymorphism

    -> method overriding


 */

class A{

    int x=45;
    int z=40;

    void print()
    {
        System.out.println("Class A Print"); 
    }

    void msg()
    {
        System.out.println("Msg Method");
    }
}
class B extends A{

    int x=50;
    int y=67;

    void print()
    {
        System.out.println("Class B Print");
    }

    void display()
    {
        System.out.println("Display Method");
    }
}


public class Polyumorphism2 {
    public static void main(String[] args) {
        
        B obj = new B();
        obj.print();
        obj.msg();
        obj.display();

        A o1 = new A();
        o1.print();
        o1.msg();
        // o1.display();

        // B o3 = new A(); - invalid

        A o2 = new B();
        o2.print();
        o2.msg();
        // o2.display();
        System.out.println(o2.x);
        // System.out.println(o2.y);
        System.out.println(o2.z);

    }
}
