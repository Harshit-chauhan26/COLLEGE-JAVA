import java.util.*;
public class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        System.out.println(fact);
    }
}