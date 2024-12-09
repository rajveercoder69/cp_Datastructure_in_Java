import java.util.*;
class connectropescostproblem
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the character");
        int[] ropes=new int[n];
        for(int i=0;i<n;i++)
        {
            ropes[i]=sc.nextInt();
        }
        connectropescostproblem obj=new connectropescostproblem();
        System.out.println("The cost of connecting ropes are:"+obj.findcost(ropes,n));
    }
    public int findcost(int[] ropes,int n)
    {
        int sum=0;
        int cost=0;
        PriorityQueue<Integer> rops=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
        {
            rops.add(ropes[i]);
        }
        sum=rops.poll();
        while(!rops.isEmpty())
        {
            sum=sum+rops.poll();
            cost+=sum;
        }
        return cost;
    }
}

