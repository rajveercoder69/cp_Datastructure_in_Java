import java.util.*;
class clock
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        char h1m='0';
        char h1mm='2';
        char h2m='0';
        char h2mm='9';
       // char h2mmm='3';
        char m1m='0';
        char m1mm='5';
        char m2m='0';
        char m2mm='9';
        char s1m='0';
        char s1mm='5';
        char s2m='0';
        char s2mm='9';
        int n=t.indexOf("@");
        System.out.println(n);
        String min="",max="";
        if(n==0)
        {
             min=t.replace('@', h1m);
             max=t.replace('@', h1mm);
        }
        else if(n==1)
        {
            int i=t.charAt(0)-'0';
            if(i<2)
            {
                min=t.replace('@', h2m);
             max=t.replace('@', h2mm);
            }
            else
            {
                min=t.replace('@', '0');
             max=t.replace('@', '3');
            }
        }
        else if(n==3)
        {
            min=t.replace('@', m1m);
             max=t.replace('@', m1mm);
        }
        else if(n==4)
        {
            min=t.replace('@', m2m);
             max=t.replace('@', m2mm);
        }
        else if(n==6)
        {
            min=t.replace('@', s1m);
             max=t.replace('@', s1mm);
        }
        else if(n==7)
        {
            min=t.replace('@', s2m);
             max=t.replace('@', s2mm);
        }
        System.out.println(min+"\n"+max);
    }
}