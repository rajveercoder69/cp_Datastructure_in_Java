import java.util.Scanner;
public class Infintietimssa {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Infintietimssa obj=new Infintietimssa();
        System.out.println(obj.search(arr,n,7));
    }
    public int search(int[] arr,int n,int target)
    {
        int low=0;
        int high=1;
        while(target>arr[high])
        {
            low=high;
            high=high*2;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return  mid;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
}
