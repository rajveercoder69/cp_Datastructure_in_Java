import java .util.*;
public class binarysearch {
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
        binarysearch obj=new binarysearch();
        System.out.println("index of the numn is:"+ obj.search(arr,2,0,arr.length-1));
    }
    public int search(int[] arr,int target,int min,int max)
    {
        int mid=0;
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
                System.out.println(mid);
            return mid;
            }
        }
        return -1;
    }
}
