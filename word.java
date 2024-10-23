import java.util.*;
public class word {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
int count=0;
String s=st.trim();
for(int i=0;i<s.length()-1;i++)
{
    if(s.charAt(i)==' '&&(s.charAt(i-1)!=' '))
    count++;
}
System.out.println(count+1);
}
}

