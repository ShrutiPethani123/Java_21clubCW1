// package OOPS;

/*

-> constructor : 

    -> name of constuctor is same as class name
    -> do not have return type
    -> use: intialize the instance variable
    -> constructor call automatically when  objects are created

    There are three type of constructor

    1. default constructor
    2. Perametrized constructor
    3. copy constructor

 */
class Sample{

    int x;
    float y;

    Sample()
    {
        // default constructor
        System.out.println(x); 
        System.out.println("Default constructor called!!!");
        x=50;
    }

    Sample(int z){
        //perametrized constructor
        System.out.println("Perametrized constructor called!!!");
        x=z;
    }

    Sample(int a,int b)
    {
        x=a;
        y=b;
    }

    Sample(Sample s)
    {
        x=s.x;
    }


}

public class Constructor {
    public static void main(String[] args) {

        Sample s1 = new Sample();
        System.out.println(s1.x);

        Sample s2 = new Sample();
        System.out.println(s2.x);
        System.out.println(s2.y);

        Sample s3 = new Sample(10);
        System.out.println(s3.x);

        Sample s4 = new Sample(60,70);
        System.out.println("x= "+ s4.x + " y = "+s4.y);

        Sample s5 = new Sample(s4);
        System.out.println("x= "+s5.x);
        System.out.println(s4.x);
    }
}
