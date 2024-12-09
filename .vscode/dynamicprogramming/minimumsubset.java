import java.util.*;
public class minimumsubset {
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
        int [][] dp=new int[len+1][sum+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        minimumsubset obj=new minimumsubset();
      int p=obj.minimum(dp,arr,0,sum,len-1);
      System.out.println(p);
    }
    public int minimum(int[][] dp,int[] arr,int calc,int sum,int i)
    {
        if(i==0)
        {
            return Math.abs((sum-calc)-calc);
        }
      if(dp[i][calc]!=-1)
      {
        return dp[i][calc];
      }
        dp[i][calc]=Math.min(minimum(dp,arr,calc+arr[i],sum,i-1),minimum(dp,arr,calc,sum,i-1));
        return dp[i][calc];
    }
}
