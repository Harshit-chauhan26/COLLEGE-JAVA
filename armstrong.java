
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=0;
        int n=sc.nextInt();
        int num=n;
        int c=n;
        while(num>0)
        {
            d++;
            num/=10;
        }
        int sum=0;
        while(n>0)
        {
            int cd=n%10;
            int p=1;
            for(int i=1; i<=d;i++)
            p=p*cd;
            sum=sum+p;
            n/=10;
    }
    System.out.print(sum==c);
}
}
