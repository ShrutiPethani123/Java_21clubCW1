import java.util.Scanner;


/*
boolean-  true , false - nextBoolean()
byte - nextByte()
short - nextShort()
int - nextInt()
long - nextLong()
float - nextFloat()
double - nextDouble()
char - nextChar() - invalid

class - 
String - next() , nextLine()


name(string)
age - (byte)
address ( string)
pincode (int)
mobile no (long)
marks ( float)
spi (double)
gender(char - M , F)
voting ( boolean)
rank ( short )



 */

 public class Test{

    public static void main(String[] args) {
        
        // System.out.println("3>5 it s tue or false ?");
        // boolean b;
        Scanner sc = new Scanner(System.in);
        // b=sc.nextBoolean();
        // System.out.println("Ans is "+b);

        System.out.println("Enter your name: ");
        String str=sc.nextLine();
        System.out.println("Your name is "+ str);

        char ch;
        System.out.println("Enter single character: ");
        ch = sc.next().charAt(0);
        System.out.println(ch);
    }

 }

 /*
  
 task 1.
 task 2.
  */