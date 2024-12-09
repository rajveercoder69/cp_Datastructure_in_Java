import java.util.*;
public class nonrepeatinglettar
{
    public void nonrepeatingletter(String str)
    {
        Queue<Character> pq=new LinkedList<Character>();
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            pq.add(ch);
            freq[ch-'a']++;
            while(!pq.isEmpty()&&freq[pq.peek()-'a']>1)
            {
                pq.remove();
            }
            if(pq.isEmpty())
            {
                System.out.print(-1+" ");
            }
            else
            {
                System.out.print(pq.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        nonrepeatinglettar obj=new nonrepeatinglettar();
        obj.nonrepeatingletter(str);
    }
}