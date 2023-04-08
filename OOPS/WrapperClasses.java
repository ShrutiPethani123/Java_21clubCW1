/*

Wrapper class: 

boolean - Boolean
byte - Byte
short - Short
int - Integer
long - Long
float - Float
double - Double
char - Character


 */



public class WrapperClasses {
    public static void main(String[] args) {
        
        // Auto boxing (Primitive -> Wrapper class)
        // int i = 450;
        // System.out.println("Hashcode of i: " + System.identityHashCode(i));
        // Object o1 = new Object();
        // System.out.println(System.identityHashCode(o1));
        // System.out.println(o1.hashCode());
        
        // // Integer j = i;
        // Integer j = Integer.valueOf(i);
        // // System.out.println(((Object)j).getClass().getSimpleName());
        // // System.out.println(((Object)i).getClass().getSimpleName());

        // System.out.println("Hashcode: " + System.identityHashCode(j));
        // System.out.println("Hashcode: " + System.identityHashCode(i));
        // System.out.println("Hashcode: " + System.identityHashCode(i));
        // System.out.println("Hashcode: " + System.identityHashCode(i));
        // System.out.println("Hashcode: " + System.identityHashCode(j));
        // System.out.println(System.identityHashCode(o1));
       
      
        // System.out.println(i+ " " + j);
    

        int a = 34;
        // Integer b = a;
        // Integer b = new Integer(30);
        // Integer c = Integer.valueOf(45);
        // Integer c = Integer.valueOf("345");
        // Integer c = Integer.valueOf("dfhbda");
       int d = Integer.parseInt("52346423");
       int e = Integer.valueOf("3534");
       String f = Integer.toString(657474);
        // Integer c = 45;
        System.out.println(a + " " + d + " " + e);

      
        //unboxing -> Wrapper class to Primitive

        Integer n1 = Integer.valueOf(56);
        int n2 = n1;
        int n3 = n1.intValue();
        // int n3 = Integer.valueOf(n1);
        System.out.println(n1 + " " + n3);


        String f1 = Float.toString(547357.5643f);
        System.out.println(f1);


    }
}
/*

-> Byte , Short , Double




 */