import java.util.*;
class dota
{
    public static void main(String args[])
    {
        dota obj=new dota();
        obj.solution("RDRDRDDDRDDRRDDDRRDRRRRRDRRRDD");
    }
    public void solution(String senate)
    {
        Queue<Integer> Radiant=new LinkedList<>();
        Queue<Integer> Dire=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i)=='R')
            {
                Radiant.offer(i);
            }
            else
            {
                Dire.offer(i);
            }
        }
        if(Radiant.size()==0)
        {
             System.out.println("Dire");
        }
        if(Dire.size()==0)
        {
            System.out.println("Radiant");
        }
        while(!Radiant.isEmpty()&&Dire.isEmpty())
        {
            if(Radiant.poll()<Dire.poll())
            {
                Dire.poll();
                int nn=Radiant.poll();
                Radiant.offer(nn+n);
            }
            else
            {
                Radiant.poll();
                int p=Dire.poll();
                Dire.offer(p+n);
            }
        }
        System.out.println(Radiant.size()>Dire.size()?"Radiant":"Dire");
    }
}