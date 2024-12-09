import java.util.*;
public class kfrequentnumber {
    public static class Number implements Comparable<Number>
    {
        Integer disty;
        Integer id;
        public  Number(int disty,int id)
        {
            this.disty=disty;
            this.id=id;
        }
        @Override
        public int compareTo(Number c)
        {
           return this.disty-c.disty;
        }
    }
    PriorityQueue<Number> pq;
    HashMap<Integer,Integer> map;
    public kfrequentnumber()
    {
        this.pq=new PriorityQueue<Number>(Comparator.reverseOrder());
        this.map=new HashMap<Integer,Integer>();
    }
    public static void main(String arg[])
    {
        kfrequentnumber obj=new kfrequentnumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       obj.kfrequentnumbe(arr,n);
    }
    public void kfrequentnumbe(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int k=map.get(arr[i]);
                map.put(arr[i],k+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(int j:map.keySet())
        {
            pq.add(new Number(map.get(j),j));
        }
        for(int ll=0;ll<2;ll++)
        {
            System.out.println("This is kfrequent:"+pq.poll().id);
        }
    }
}
