import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();

        String s="";
        for(int i=0;i<n;i++)
        {
            s+="abcd";
        }
        s=s.toString();
        for(int i=0;i<n;i++)
        System.out.println(s.substring(0,i+1));
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}