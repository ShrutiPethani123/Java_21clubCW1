/*

Exception: 
Error: 

          Object
            |
         Throwable
         /      \
      Exception  Error
      /     \
  1. RunTimeException 
        1. ArithmeticException
        2. IndexOutOfBoundException
            1. StringIndexOutOfBoundException
            2. ArrayIndexOutOfBoundException
        3. NullPointerException
        4. ClassNotFoundException
        .
        .
        .
  2. SQLException
  3. IOException
        1. EOFException
        2. IntruptedException
        

Type:

1. checked Exception: IOException, EOFException , IntruptedException
2. Unchecked Exception:  RunTimeException  , ArithmeticException


 */


import java.util.Scanner;

import javax.print.attribute.standard.Finishings;
public class Task1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // float ans = n/m;
        float ans=0;
        try{
            ans = n/m;
            System.out.println(ans);

        }
        // catch(NullPointerException a)
        // {
        //     // a.printStackTrace();
        //     System.out.println("can't devide by 0");
        // }catch(ArithmeticException e)
        // {
        //     e.printStackTrace();
        // }catch(Exception e)
        // {
        //     e.printStackTrace();
        // }
        finally
        {

            System.out.println("Finally block Executed!!");
        }


        // final , finally , finalize



        
        System.out.println("Thank You!!!");
    }
}
