import java.util.*;
public class firstoccureleininfinite {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the numbver");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        firstoccureleininfinite obj=new firstoccureleininfinite();
        System.out.println("Enter the value which is to be searched");
        int target=sc.nextInt();
        obj.search(nums,n,target);
    }
    public void search(int[] nums,int n,int target)
    {
        int low=0;
        int high=low+1;
        int ans=-1;
        while(target>nums[high])
        {
            low=high;
            high=high*2;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else {
                ans=mid;
                high=mid-1;
            }
        }
        System.out.println("The index of value in first occurence:"+ ans);
    }
}
