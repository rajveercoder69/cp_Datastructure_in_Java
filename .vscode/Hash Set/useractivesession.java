public class useractivesession {
    static class Solution {
        public int[] findingUsersActiveMinutes(int[][] logs, int k) {
            int n=logs.length;
            int[][] arr=new int[n][2];
            int ans[]=new int[k];
            for(int i=0;i<n;i++)
            {
                int p=logs[i][0];
                p=p%n;
                if(arr[p][0]<logs[i][1])
                {
                    arr[p][0]=logs[i][1];
                    arr[p][1]++;
                }
                else if(arr[p][0]>logs[i][1])
                {
                     arr[p][1]++;
                }
            }
            for(int j=0;j<n;j++)
            {
                int q=arr[j][1];
                q=q%k;
                if(q>=1)
                {
                ans[(q-1)]++;
                }
            }
            return ans;
        }
    public static void main(String arg[])
    {
        Solution obj1=new Solution();
        int[][] arr={{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k=5;
        int [] l=obj1.findingUsersActiveMinutes(arr,k);
        for(int i=0;i<k;i++)
        {
            System.out.print(l[i]+" ");
        }
    }
    }
}
