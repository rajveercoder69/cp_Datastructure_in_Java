public class Problemi {
    public static void main(String args[])
    {
        Problemi obj=new Problemi();
        int[] ar={1,2,3,2};
        int []arr=obj.longestObstacleCourseAtEachPosition(ar);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
        public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
            int n=obstacles.length;
            int[] arr=new int[n];
            int count=1;
            int j=0;
            int c=0;
            arr[j]=1;
            for(int i=1;i<n;i++)
            {
                if(obstacles[i-1]<=obstacles[i])
                {
                    count=count+1;
                    arr[i]=count;
                }
                else
                {
                    c=check(obstacles,arr,i-1,obstacles[i]);
                    arr[i]=c+1;
                }
            }
        return arr;
        }
        public int check(int[]num,int[] a,int k,int target)
        {
            int cc=0;
            while(k>0)
            {
                if(num[k]<=target)
                {
                    cc=a[k];
                    break;
                }
                else
                cc=a[0];
            }
            return cc;
        }
}
