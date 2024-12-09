import java .util.*;
public class firstandlastOccurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and length of sorted Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        firstandlastOccurence obj=new firstandlastOccurence();
        System.out.println("index of the numn is:"+ obj.firstsearch(arr,3));
        System.out.println("index of the numn is:"+ obj.lastsearch(arr,3));
    }
    public int firstsearch(int[] arr,int target)
    {
        int min=0;
        int max=arr.length-1;
        int mid=0;
        int ans=0;
        while(min<=max)
        {
            mid=min+((max-min)/2);
            if(arr[mid]<target)
            {
                System.out.println(mid);
                min=mid+1;
            }
            else if(arr[mid]>target)
            {
                System.out.println(mid);
                max=mid-1;
            }
            else
            {
            ans=mid;
            max=mid-1;
            }
        }
        return ans;
    }
    public int lastsearch(int[] arr,int target)
    {
        int min=0;
        int max=arr.length-1;
        int mid=0;
        int ans=0;
        while(min<=max)
        {
            mid=min+((max-min)/2);
            if(arr[mid]<target)
            {
                min=mid+1;
            }
            else if(arr[mid]>target)
            {
                System.out.println(mid);
                max=mid-1;
            }
            else
            {
            ans=mid;
            min=mid+1;
            }
        }
        return ans;
    }
}
