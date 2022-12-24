import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        // char ch=sc.next().charAt(0); // valid
        // String ch=sc.next(); // valid
        // boolean ch=sc.nextBoolean(); // invalid
        // int ch=sc.nextInt(); - valid
        // float ch = sc.nextFloat(); //invalid
        // double ch=sc.nextDouble(); // invalid
        // long ch = sc.nextLong(); // invalid
        short ch = sc.nextShort(); // valid


        /*
        valid data type for switch -> int , byte , short , char ,string
        invalid -> boolean , float , double , long

         */

        switch(ch)
        {
            // case 'a':
            // case 'e':
            // case 'i':
            // case 'o':
            // case 'u':
            //     System.out.println("Vowel....");
            //     break;
            // default:
            //     System.out.println("Consonat..");
        }

    }
}
