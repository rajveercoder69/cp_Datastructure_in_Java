import java.util.*;
public class sumstring {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int i=0;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='=')
            {
                break;
            }
        }
        String st=str.substring(0, i);
        String s=str.substring(i+1);
        System.out.println(st+"jdhcjd"+s);
       int j=0;
       i=0;
       int count=0;
       while(j<s.length()&&i<st.length())
       {
        char ch=st.charAt(i);
        char ch2=s.charAt(j);
            if(ch==ch2)
            {
                j++;
                i++;
            }
            else{
                 int a=0;
                while(i<st.length())
                {
                     a+=st.charAt(i)-'0';
                    int b=s.charAt(j)-'0';
                    count++;
                    i++;
                    if(a>9)
                    {
                        j++;
                        i++;
                    }
                    if(a==b)
                    {
                        break;
                    }
                }
            }
       }
       if(i<st.length()||j<s.length())
       {
        System.out.println(-1+"hd"+i+"hbs"+j);
       }
       System.out.println(count-1);
    }
}
