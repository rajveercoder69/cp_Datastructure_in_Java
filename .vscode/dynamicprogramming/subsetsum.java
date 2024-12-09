import java.util.*;
public class subsetsum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array for subset sum problem");
        int len=sc.nextInt();
        System.out.println("Enter the value in the Array for subset sum problem");
        int[] arr=new int[len];
        for(int i=0; i<len; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the subset sum value");
        int sum=sc.nextInt();
        subsetsum obj=new subsetsum();
        int[] sums=new int[arr.length];
      int p=obj.targetsum(sums,arr,0,sum,0);
      System.out.println(p);
    }
    public int targetsum(int[] sums,int[] arr,int index,int sum,int target)
    {
        int ans=0;
        if(target==sum)
        {
            System.out.println("valid");
            for(int i:sums)
            {
            if(i>0)
            {
            System.out.print(i+" ");
            }
            }
            System.out.println(" ");
            return 1;
        }
        if(index==arr.length)
        {
            return 0;
        }
        sums[index]=arr[index];
        ans+=targetsum(sums,arr, index+1, sum, target+arr[index]);
        sums[index]=-1;
        ans+=targetsum(sums,arr, index+1, sum, target);
        return ans;
    }
}
