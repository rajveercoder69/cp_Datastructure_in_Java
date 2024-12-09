import java.util.*;
public class kclosestnumber {
    public static class Number implements Comparable<Number>
    {
        int disty;
        int id;
        public  Number(int disty,int id)
        {
            this.disty=disty;
            this.id=id;
        }
        @Override
        public int compareTo(Number c)
        {
            if(this.disty==c.disty)
            {
                return this.id-c.id;
            }else
            {
            return this.disty-c.disty;
            }
        }
    }
    PriorityQueue<Number> pq;
    public kclosestnumber()
    {
        this.pq=new PriorityQueue<Number>();
    }
    public static void main(String arg[])
    {
        kclosestnumber obj=new kclosestnumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       obj.kclosestnumbe(arr,n,7);
    }
    public void kclosestnumbe(int[] arr,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            pq.add(new Number((Math.abs(arr[i]-k)), arr[i]));
        }
        for(int j=0;j<3;j++)
        {
            System.out.println("This is k closest number"+pq.poll().id);
        }
    }
}
