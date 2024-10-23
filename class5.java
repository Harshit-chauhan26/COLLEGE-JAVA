public class class5 {
    public static void main(String[] args)
    {
        long start,end;
        start=System.nanoTime();
        for(int i=0;i<50;i++)
         System.out.println("harshit");
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            System.out.println("harshit");
        }
        StringBuilder s=new StringBuilder();
        s.append("harshit");
        end=System.nanoTime();
        System.out.println(end-start);
    }
    
}