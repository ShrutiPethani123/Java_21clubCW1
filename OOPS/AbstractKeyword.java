/*

    abstract 

    -> we can't create object of abstract class.
    -> abstract method do not have body

 */
abstract class Test{

    int a=56;

    void display()
    {
        System.out.println("Non abstract Method");
    }

    abstract void msg();
}

class Test2 extends Test{

    void msg()
    {
        System.out.println("Abstract Method overide");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        
        // Test obj = new Test();
        Test2 obj = new Test2();
        obj.display();
        obj.msg();


    }
}
