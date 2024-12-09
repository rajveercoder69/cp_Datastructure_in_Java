import java .util.*;
public class findingfloorvalue {
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
        findingfloorvalue obj=new findingfloorvalue();
        System.out.println("index of the numn is:"+ obj.search(arr,7));
    }
    public int search(int[] arr,int target)
    {
        int min=0;
        int max=arr.length-1;
        int mid=0;
        int res=0;
        while(min<=max)
        {
            mid=min+((max-min)/2);
            if(arr[mid]<target)
            {
                System.out.println(mid);
                res=mid;
                min=mid+1;
            }
            else if(arr[mid]>target)
            {
                System.out.println(mid);
                max=mid-1;
            }
            else
            {
            return mid;
            }
        }
        return res;
    }
}
