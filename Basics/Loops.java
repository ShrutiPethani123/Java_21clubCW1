/*
 * 
 * 2 Types
 * 
 * 1. Entry control
 *      for , while
 * 2. Exit control
 *      do while
 * 
    for(intialization ; condition ; inc/dec)
    {
        // block of code
    }

    intialization
    while(condition)
    {
        inc/dec
        // block of code
    }

    do{
        //block of code

    }while(condition);
 * 
 */

public class Loops {
    
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int j=10;
        while(j>0)
        {
            System.out.print(j+" ");
            j--;
        }

        System.out.println();
        int k=10;
        do{
            System.out.print(k-- +" ");

        }while(k>0);
    }
}

/*

1. Print 50 to 40 in reverse order using all loops.
2. print all even number between 20 to 30 using do while loop.
3. print all odd number between 10 to 30 using while loop and without if.
4. count number of digit.   ex: 35345 - 5
5. sum of all digit of number. ex: 1542 -12
6. Print reverse number. ex: 56521 - 12565
7. check number is palindrom number. - 5665- palindrom 
8. find gcd(HCF) of two number.

    12- 1 2 3 4 6 12
    6- 1 2 3 6

    hcf = 6

9. Find LCM of two number.

    6 - 6 12 18 24...
    12 - 12 24 36 ..

    lcm = 12

10. check number is prime or not.

11. take two number from user and print all prime number between this range,

    2 , 20

    3 5 7 11 13 17 19






 */
