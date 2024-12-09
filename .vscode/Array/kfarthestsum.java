import java.util.*;
public class kfarthestsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter the number of in array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the farthest element");
        int k=sc.nextInt();
        System.out.println("enter the number of element to make sum");
        int t=sc.nextInt();
        kfarthestsum obj=new kfarthestsum();
        System.out.println("The kfarthest sum is:"+obj.farthestsum(n,arr,k,t));
    }
    public int farthestsum(int n,int[] arr,int k,int t)
    {
        int[] pans=new int[n];
        for(int i=0;i<n;i++)
        {
            int p=arr[i]-k;
            pans[i]=Math.abs(p);
        }
        Arrays.sort(pans);
        int kk=n-1;
        int sum=0;
        for(int j=0;j<t;j++)
        {
            sum+=pans[kk];
            kk--;
        }
        return sum;
    }
}
