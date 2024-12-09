import java.io.*;
import java.util.Scanner;
public class peekelement {
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
       peekelement obj=new peekelement();
        System.out.println(obj.search(arr,n));
    }
    public int search(int[]arr,int n)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int  mid=low+(high-low)/2;
            if(mid>0&&mid<n-1)
            {
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
                {
                    return mid;
                }
                else if(arr[mid-1]>arr[mid+1])
                {
                    high=mid-1;
                }
                else
                {
                    low =mid+1;
                }
            }
            else if(mid==0)
            {
                if(arr[mid]>arr[mid+1])
                return mid;
            }
            else if(mid==n-1)
            {
                if(arr[mid]>arr[mid-1])
                {
                    return n-1;
                }
            }
        }
        return -1;
    }
}
