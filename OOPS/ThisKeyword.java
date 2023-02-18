/*

this: variables, method , constructor

 */

class A{

    int a=35;

    A()
    {
        this(3,4);
        System.out.println("Default constructor");
    }

    A(int a , int b)
    {
        // this(); // first line
        System.out.println("Perametrized constructor");
       
    }

    void print()
    {
        // System.out.println("Hello" + a);
        System.out.println("Hello " + this.a);
    }

    void display()
    {
        // this.print();
        print();
        System.out.println("Good Morning");
    }

}

class B{


}


public class ThisKeyword {
    public static void main(String[] args) {
       
        // A obj = new A();
        // // obj.print();
        // obj.display();

        // A obj = new A(1,3);
// 
    }
}
