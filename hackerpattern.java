import java.util.Scanner;
public class hackerpattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=n*4-3;
        int mid1=total/2;
        int mid2=(n*2-1)/2;
        char c=(char)(94+n);
        int k=0;
        for(int i=0;i<(n*2-1);i++)
        {
            c=(char)(96+n);
            for(int  j=0;j<total;j++)
            {
                if(j>=(mid1- k*2) &&j<=(mid1 + k*2)&&j%2==0){
                    System.out.print(c);
               c=j<mid1?--c:++c;
                }
                else
                System.out.print('-');
            }
            k=i<mid2?++k:--k;
            System.out.println();
        }

       
    }

    
    
    
}