import java.util.*;
public class countsubset {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the value in the Array");
        int[] v = new int[n];
        int sum=0;
        for (int i=0; i<n; i++)
        {
        v[i]=sc.nextInt();
        sum += v[i];
        }
        System.out.println("Enter the difference");
        int d=sc.nextInt();
        int [][] dp=new int[n][sum];
        for(int [] row:dp)
        Arrays.fill(row,-1);
        countsubset obj=new countsubset();
        System.out.println(obj.countsub(dp,n-1,v,0,(sum-d)/2));
    }
    public int countsub(int[][]dp,int n, int[] v, int sum,int csum )
    {
         if(sum==csum)
        return 1;
        if(n<0)
        {
        return 0;
        }
        if(sum+v[n]>csum)
        {
            countsub(dp,n-1, v, sum,csum);
        }
        if(dp[n][sum]!=-1)
        return dp[n][sum];
        int ans=0;
        int ans1=0;
        ans+=countsub(dp,n-1, v, sum+v[n],csum);
        ans1+=countsub(dp,n-1, v, sum,csum);
        return dp[n][sum]=ans+ans1;
    }
}
