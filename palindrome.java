import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String st="";
        for(int i=0;i<s.length();i++)
        st=s.charAt(i)+st;
        if(st.equals(s))
        System.out.println("yes");
         else
        System.out.println("No");
    


    }
}