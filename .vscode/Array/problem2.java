import java.util.*;
class Solutionw {
    public static void main(String args[])
    {
        Solutionw obj=new Solutionw();
        int[] arr={0,1};
        int n=obj.firstMissingPositive(arr);
        System.out.println(n);
    }
    public int firstMissingPositive(int[] nums) 
    {
        int j=1;
        Arrays.sort(nums);
        if(nums.length<=2)
        {
            if(nums[0]==1)
            {
                return 2;
            }
            else if(nums[0]==-1&& nums[1]==1000)
            {
                return 1;
            }
            else
            {
                return 1;
            }
        }
        else if(nums.length==2)
        {
            if(nums[0]==0&&nums[1]==1)
            {
                return 2;
            }
        }
        else
        {
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0)
            {
                k++;
                continue;

            }
             if(i==nums.length-1)
            {
                k=nums.length-2;
                j++;
            }
            else if(nums[i]==j)
            {
                if(nums[i]==nums[k])
                {
                   j=j;
                   k++;
                }
                else
                {

                    j++;
                    k++;
                }
            }
            else
            {
                break;
            }
        }
        }
        return j;
    }
}

