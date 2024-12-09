import java.util.*;
public class knapsack {
    public static void main(String[] args)
    {
        int []wt={1,3,4,5};
        int [] val={1,4,5,7};
        int W=7;
        int[][] dp=new int[wt.length+1][W+1];
        for(int i=0;i<wt.length+1;i++)
        {
            for(int j=0;j<W+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        knapsack obj=new knapsack();
        System.out.println(obj.backtrack(wt,val,W,wt.length,dp));
    }
    public int backtrack(int[] wt,int[] val,int W,int n,int[][] dp)
    {
        if(n==0||W==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
         if(wt[n-1]>W)
        {
            return dp[n][W]=backtrack(wt, val, W, n-1,dp);
        }
        else
        {
            return dp[n][W]=max((val[n-1]+backtrack(wt, val, W-wt[n-1], n-1,dp)),backtrack(wt, val, W, n-1,dp));
        }
    }
    static int max(int a, int b) { return (a > b) ? a : b; }
 
}
