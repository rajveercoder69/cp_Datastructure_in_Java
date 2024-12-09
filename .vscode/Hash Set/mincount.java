import java.util.*;
public class mincount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
    mincount obj=new mincount();
    System.out.println("The Strings is:"+ obj.count(str));
    }
    public String count(String str)
    {
        String ans="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(i==0)
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else if(str.charAt(i-1)==str.charAt(i))
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else if(str.charAt(i-1)!=str.charAt(i))
            {
                if(map.get(str.charAt(i-1))==1)
                {
                    ans+=str.charAt(i-1);
                }
                else
                {
                ans+=str.charAt(i-1)+Integer.toString(map.get(str.charAt(i-1)));
                }
                map.clear();
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        if(map.get(str.charAt(str.length()-1))==1)
            {
                ans+=str.charAt(str.length()-1);
            }
        else
            {
                ans+=str.charAt(str.length()-1)+Integer.toString(map.get(str.charAt(str.length()-1)));
            }
        return  ans;
    }
}
