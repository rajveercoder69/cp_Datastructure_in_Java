import java.util.*;
public class weaksoldierproblem {
    public static class soldier implements Comparable<soldier> 
    {
        int disty;
        int id;
        public  soldier(int disty,int id)
        {
            this.disty=disty;
            this.id=id;
        }
        @Override
        public int compareTo(soldier c)
        {
            if(this.disty==c.disty)
            {
                return this.id-c.id;
            }
            else
            {
            return this.disty-c.disty;
            }
        }
    }
    PriorityQueue<soldier> pq;
    public weaksoldierproblem()
    {
        this.pq=new PriorityQueue<soldier>(Comparator.reverseOrder());
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[][] solcivi=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                solcivi[i][j]=sc.nextInt();
            }
        }
        weaksoldierproblem obj=new weaksoldierproblem();
        obj.weakrow(solcivi,n,2);
    }
    public void weakrow(int[][] solcivi,int n,int k)
    {
        int sum=0;
        int i;
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=solcivi[i][j];
            }
            pq.add(new soldier(sum, i));
            sum=0;
        }
    while(i>k)
    {
        pq.remove();
        i--;
    }
    while(!pq.isEmpty())
    {
        System.out.println("row"+pq.poll().id);
    }
}
}

