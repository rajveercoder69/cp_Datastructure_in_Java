import java.util.*;
class BESTSUM
{
    static int MAX=10;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
      int[][] dp=new int[MAX][MAX];
      for(int i=0;i<MAX;i++)
      {
        for(int j=0;j<MAX;j++)
        dp[i][j]=-1;
      }
      System.out.println(maxsum(a,n,0,k,dp));
    }
    public static int maxsum(int[] a, int n,int ind, int k, int[][] dp)
    {
        if(k==0)
        {
            if(ind==n)
            {
                return 0;
            }
            else
            {
                return -1000000000;
            }
        }
        else if(ind ==n)
        {
            return -1000000000;
        }
        else if(dp[ind][k]!=-1)
        return dp[ind][k];
        else
        {
            int ans=0;
            int mini=a[ind];
            for(int i=ind;i<n;i++)
            {
                mini=Math.min(mini,a[i]);
                ans=Math.max(ans,maxsum(a, n, i+1, k-1, dp));
            }
            return dp[ind][k]=ans;
        }
    }
}