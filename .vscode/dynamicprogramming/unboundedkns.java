import java.util.*;
public class unboundedkns {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of val and weight");
        int n=sc.nextInt();
        System.out.println("Enter the value and Weight in array of wt and val");
        int []wt=new int[n];
        int [] val=new int[n];
        for(int i=0; i<n; i++)
        {
            val[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        System.out.println("Enter the limit of knapsack");
        int W=sc.nextInt();
        int[][] dp=new int[wt.length+1][W+1];
        for(int i=0;i<wt.length+1;i++)
        {
            for(int j=0;j<W+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        unboundedkns obj=new unboundedkns();
        System.out.println(obj.backtrack(wt,val,W,wt.length,dp));
    }
    public int backtrack(int[] wt,int[] val,int W,int n,int[][] dp)
    {
        if(n==0||W==0)
        return 0;
        if(dp[n][W]!=-1)
        return dp[n][W];
        if(wt[n-1]>W)
        return dp[n][W]=backtrack(wt,val,W,n-1,dp);
        return dp[n][W]=Math.max(val[n-1]+backtrack(wt,val,W-wt[n-1],n,dp),backtrack(wt,val,W,n-1,dp));
    }
}
