import java.util.*;
public class ab
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] names=new String[n];
     int count=0;
    for(int i=0;i<n;i++)
    {
    names[i]=sc.next();
    }
    for(int j=0;j<n;j++)
    {
    String st=names[j];
    int a=-1;
    int b=-1;
    int counter=0;
    for(int i=0;i<st.length();i++)
    {
        char ch=st.charAt(i);
        if(ch=='a')
        {
            a=i;
        }
        else if(ch=='b')
        {
            b=i;
        }
        else
        {
            counter++;
            break;
        }
        if(b!=-1&&a!=-1)
        {
            if(a>b)
            {
                break;
            }
        }
        if(a>0&&b==-1&&a==st.length()-1)
        {
            break;
        }
        if(b>0&&a==-1&&i==st.length()-1)
        {
            break;
        }
    }
    if(a<b&&a!=-1&&b!=-1&&counter==0)
    {
        count++;
    }
}
System.out.println(count);
}
}