import java.util.*;
public class closestvalueofelement {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for size");
        int n=sc.nextInt();
        System.out.println("Enter the value in array");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the number which closest you try to find");
        int target=sc.nextInt();
        closestvalueofelement obj=new closestvalueofelement();
        obj.search(nums,target);
    }
    public void search(int[] nums,int target)
    {
        int top=ceilsearch(nums,target);
        int bottom=floorsearch(nums,target);
        if((top-target)<=(target-bottom))
        {
            System.out.println(top);
        }
        else
        {
            System.out.println(bottom);
        }
    }
    public int  ceilsearch(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                ans=nums[mid];
                high=mid-1;
            }
            else
            {
                return  nums[mid];
            }
        }
        return ans;
    }
    public int  floorsearch(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<target)
            {
                ans=nums[mid];
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                return  nums[mid];
            }
        }
        return ans;
    }
}
