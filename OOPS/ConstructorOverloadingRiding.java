class A
{

    A()
    {
        System.out.println("A class Default constructor");
    }

    A(int c)
    {
        System.out.println("A class Perametrized constructor");
    }

}

class B extends A{

    B()
    {
        super(5);
        System.out.println("B class Default constructor"); 
    }

    B(int x)
    {
        System.out.println("B class Perametrized constructor"); 
    }


}


public class ConstructorOverloadingRiding {
    public static void main(String[] args) {
        
        B obj = new B(6);

    }
}
