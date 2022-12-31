import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no:");
        int n1 = sc.nextInt();
        System.out.println("Enter a no:");
        int n2 = sc.nextInt();
        int flag = 0;

        for (int j = n1; j < n2; j++) {
            flag=0;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                }

            }
            if(flag==0)
            {
                System.out.println(j+" ");
            }

        }

        // for(int i=2;i<=n/2;i++)
        // {
        // if(n%i==0){
        // flag=1;
        // break;
        // }

        // }

        // if(flag==0)
        // {
        // System.out.println("Prime");
        // }else{
        // System.out.println("Not prime");
        // }

    }
}

/*
 * 
 * 12 - 1 2 3 4 6 12
 * 
 */