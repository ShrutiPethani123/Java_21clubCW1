// super - constructor , method , variable

class X{
    int d=50;
    X()
    {
        System.out.println("X class DC");
    }

    void xData()
    {
        System.out.println("Parent Method");

    }
}

class Y extends X{

    Y()
    {
        System.out.println("Y class DC");
    }

    Y(float c)
    {
        // super();
        this(); // not valid for constructor calling
        System.out.println("Y class PC");
    }

    void parentData()
    {
        super.xData();
        System.out.println(super.d);
        super.xData();
    }

}

public class SuperKeyword {

    public static void main(String[] args) {
        
        Y obj = new Y(5.6f);
        obj.parentData();
    }
}
