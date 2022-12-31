public class HCF {
    public static void main(String[] args) {
        
        int a=4,b=50,hcf=0;

        int min = a<b?a:b;

        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }

        System.out.println("hcf: "+ hcf);


    }
}

/*

12 - 1 2 3 4 6 12
6- 1 2 3 6
 */
