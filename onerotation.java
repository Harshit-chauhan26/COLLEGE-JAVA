import java.util.Scanner;

public class onerotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=count(n);
        int d=digit;
        while(digit>0)
        {
            n=rotate(n,d);
            if(pallindrome(n))
            {
                System.out.println(true);
                System.out.println(n);
                break;
            }        
                digit--;
        }
        
    }
    public static int count(int n)
    {
        int d=0;
        while(n>0)
        {
            n/=10;
            d++;
        }
        return d;
    }
    public static int rotate(int n,int d)
    {
        return (n%10)* (int)(Math.pow(10,(d-1)))+(n/10);
    }
    public static boolean pallindrome(int n)
    {
        int num=n;
        int sum=0;
        while(n>0)
        {
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum==num;
    }
    
}