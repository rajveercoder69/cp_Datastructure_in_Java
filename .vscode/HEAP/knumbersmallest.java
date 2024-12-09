import java.util.*;
public class knumbersmallest {
    PriorityQueue<Integer> pq;
    public knumbersmallest()
    {
        this.pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
    }
    public static void main(String arg[])
    {
        knumbersmallest obj=new knumbersmallest();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       obj.kthelement(arr,n,5);
    }
    public void kthelement(int []arr,int n,int k)
    {
        int i;
        for(i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        while(i>k)
        {
            pq.remove();
            i--;
        }
        while(!pq.isEmpty())
        {
            System.out.println("this is all largest element upto k:"+pq.peek());
            pq.remove();
        }
    }
}
