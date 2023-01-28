/*


    static - variable , method , class , block

    -> 
 */


class A{

    static class B{

    }

    static int x;
    int y;
    A()
    {
        System.out.println(x);
        x++;
    }

    void print()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        int y=45;
        System.out.println(x+" "+y);
    }

    static{
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        
        A obj = new A();
        A obj1 = new A();
        A obj2 = new A();
        System.out.println(A.x);
        obj.print();
        // obj.display();
        A.display();

    }
}
