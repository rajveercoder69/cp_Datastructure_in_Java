import java.util.*;
public class equlasubset {
    private int ans=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array for subset sum problem");
        int len=sc.nextInt();
        System.out.println("Enter the value in the Array for subset sum problem");
        int[] arr=new int[len];
        int sum=0;
        for(int i=0; i<len; i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
          boolean [][] dp=new boolean[len+1][sum+1];
        equlasubset obj=new equlasubset();
        if(sum%2!=0)
        {
            System.out.println("this is equally not possible to divide:"+true);
        }
        else
        {
        System.out.println("this is equally distributes:"+obj.equalset(dp,arr,0,sum/2)+obj.ans);
        }
    }
    public boolean equalset(boolean[][] dp,int[] arr, int index,int sum)
    {
        if(sum==0)
        {
            return true;
        }
        if(index>=arr.length)
        {
            return false;
        }
        if(dp[index][sum]!=false)
        {
            return dp[index][sum];
        }
        if(arr[index]>sum)
        {
            return dp[index][sum]=equalset(dp, arr, index+1, sum);
        }
        else{
            if(equalset(dp, arr, index+1, sum-arr[index])!=false||equalset(dp, arr, index, sum)!=false)
            {
                return dp[index][sum]=true;
            }
            else
            {
                return dp[index][sum]=false;
            }
        }
    }
}
