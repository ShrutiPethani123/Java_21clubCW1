/*
 
    I   I
    \   / implements
      C

    I    I
    \    / extends
      I

    
 */

interface Parent1{

    void print();
    void display();
}

interface Parent2{

    void print();
    void msg();
}

class Child implements Parent1 , Parent2 
{
    public void print()
    {
        System.out.println("Print Method");
    }

    public void msg()
    {

    }

    public void display()
    {

    }


}

public class Interface2 {

    public static void main(String[] args) {
        
        Child c = new Child();
        c.print();
    }
}
