// package OOPS;

/*

There are three types of variables

1. Local Variable -> Local variable must intialize
2. Instance Variable  -> Instance Variable have Default values
3. Static Variable

 */
class Test{

    int x=34; // instance variable

    void print()
    {
        int y; // local Variable
        y=60;
        System.out.println("y= " +y);
        System.out.println("z= "+z);
    }

    int z; //instance variable
}

public class VariableType {

    int r;

    public static void main(String[] args) {
        
        int c=45; // local variable
        System.out.println("c= "+c);
        Test obj = new Test();
        obj.print();
        VariableType obj2 = new VariableType();
        System.out.println("r= "+obj2.r);
        obj2.display();

    }

    void display()
    {
        System.out.println("r= "+r);
    }
    
}
