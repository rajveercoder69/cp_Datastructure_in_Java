import java.util.*;
public class ksortedArray {
    public static void main(String arg[])
    {
        ksortedArray obj=new ksortedArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       obj.kelement(arr,n,3);
    }
    public void kelement(int[]arr,int n,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i;
        for(i=0;i<k+1;i++)
        {
            pq.add(arr[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=i;j<n;j++)
        {
            list.add(pq.poll());
            pq.add(arr[j]);
        }
        while(!pq.isEmpty())
        {
            list.add(pq.poll());
        }
        System.out.println("This is of nearly sorted now in sorted array in less time :"+list);
    }
}
