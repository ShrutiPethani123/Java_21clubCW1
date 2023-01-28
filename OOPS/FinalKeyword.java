/*

final -> constant

-> class , variable , Method

-> we can't inherite final class
-> we can't change the value of final variable.
-> we can't override final method.

 */

class Test{

    final int x=56;

    // Test(int y)
    // {
    //     x=y;
    // }

    final void print()
    {

    }


} 

class Exam extends Test{

    void print()
    {
        
    }

}

public class FinalKeyword {
    public static void main(String[] args) {
        
        Test obj = new Test(45);
        // obj.x=48;

    }
}
