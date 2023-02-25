/*

Interface: 

-> it will provide 100% abstraction
-> We can achive multipal inheritance using interface

A   B
\   /
  C


Method: public static abstract

I - interface
c - class

I
|  implements
C


C
| extends
C

c
|  not valid
I

I
| extends
I

private < default  < protected < public

 */

interface GOV{
    
    public void rule();
}

interface RBI extends GOV {

    void interest();
}



class HDFC implements RBI{

    public void interest()
    {
        System.out.println("HDFC: 7%");
    }

    public void rule()
    {
        System.out.println("Rules");
    }
}


public class Interface {
    
    public static void main(String[] args) {
        
        HDFC obj = new HDFC();
        obj.interest();
        obj.rule();
    }
}
