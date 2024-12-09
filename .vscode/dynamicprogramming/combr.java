import java.util.*;
public class combr {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();
        combr obj=new combr();
        int [] val=new int[value];
        for(int i=1; i<=val.length; i++)
        {
            val[i-1]=i;
        }
        obj.backtrack(val,value,0,0);
    }
    public void backtrack(int[] nums,int n,int index,int i)
    {
        if(index==n)
        {
            for(int j:nums)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
            return;
        }
        for(int j=i;j<n;j++)
        {
           swap(nums,i,j);
           backtrack(nums,n,index+1,i+1);
           swap(nums,i,j);
        }
    }
    public void swap(int [] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
