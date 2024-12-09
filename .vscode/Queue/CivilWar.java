import java.util.*;
public class CivilWar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num length");
        int n=sc.nextInt();
        Deque<Integer> a=new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        {
            a.addLast(sc.nextInt());
        }
        System.out.println(a);
        boolean iron=true;
        int ironman_Team=0;
        int captain_team=0;
        while(!a.isEmpty())
        {
            if(iron)
            {
                if(a.peekFirst()<a.peekLast())
                {
                    if(a.peekLast()<0)
                    {
                        ironman_Team+=a.pollLast();
                    }
                    else
                    {
                    while(!a.isEmpty()&&a.peekLast()>0)
                    ironman_Team+=a.pollLast();
                    }

                }
                else{
                     if(a.peekFirst()<0)
                    {
                        ironman_Team+=a.pollFirst();
                    }
                    else
                    {
                    while(!a.isEmpty()&&a.peekFirst()>0)
                    ironman_Team+=a.pollFirst();
                    }
                }
            }
            else
            {
                 if(a.peekFirst()<a.peekLast())
                {
                     if(a.peekLast()<0)
                    {
                        captain_team+=a.pollLast();
                    }
                    else
                    {
                    while(!a.isEmpty()&&a.peekLast()>0)
                    captain_team+=a.pollLast();
                    }
                }
                else{
                     if(a.peekFirst()<0)
                    {
                        captain_team+=a.pollFirst();
                    }
                    else
                    {
                    while(!a.isEmpty()&&a.peekFirst()>0)
                    captain_team+=a.pollFirst();
                    }
                }
            }
            iron=!iron;
        }
        System.out.print(ironman_Team-captain_team);
    }
}
