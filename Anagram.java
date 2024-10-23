import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder  s=new StringBuilder(sc.nextLine());
        StringBuilder  t=new StringBuilder(sc.nextLine());
        boolean te=true;

        if(s.length()!=t.length())
        System.out.println("not a anagram");
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.indexOf(t.charAt(i)+"")>=0)
                {
                    s.setCharAt(s.indexOf(t.charAt(i)+""),' ');
                }
                else
                {
                    System.out.println("not");
                    te=false;
                    break;
                }
            }
            if(te)
            System.out.println("yes");
        }
    }
    
}