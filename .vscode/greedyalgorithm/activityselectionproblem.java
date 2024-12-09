import java.util.*;
public class activityselectionproblem {
    public static void main(String arg[])
    {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        activityselectionproblem obj=new activityselectionproblem();
        obj.activity(start,end);
    }
    public void activity(int[] start,int[] end)
    {
        int[][]  arr=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o ->o[2]));
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0][0]);
        int max=1;
        int lastend=arr[0][2];
        for(int j=1;j<arr.length;j++)
        {
            if(lastend<=arr[j][1])
            {
                ans.add(arr[j][0]);
                max++;
                lastend=arr[j][2];
            }
        }
        System.out.println("this is activity:"+ans);
        System.out.println("This is maximum activity to be selected:"+max);
    }
}
