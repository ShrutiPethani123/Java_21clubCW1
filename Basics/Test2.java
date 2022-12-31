import java.util.Scanner;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("enter name:" );
        char name = scr.next().charAt(0);

        System.out.println("enter age");
        byte age = scr.nextByte();

        scr.nextLine();
        System.out.println("enter address");
        String address = scr.nextLine();

        System.out.println("enter pincode");
        int pincode = scr.nextInt();

        System.out.println("enter mobileno");
        long mobileno = scr.nextLong();

        System.out.println("enter marks");
        float marks = scr.nextFloat();

        System.out.println("enter SPI");
        double spi = scr.nextDouble();

        System.out.println("enter gender");
        char gender = scr.next().charAt(0);

        System.out.println("enter answer");
        boolean voting = scr.nextBoolean();

        System.out.println("enter rank");
        short rank = scr.nextShort();

    }
}
