import java.util.*;
public class maxchainpairlength {
    public static void main(String arg[])
    {
        int[] start={5,39,5,27,50};
        int[] end={24,60,28,40,90};
        maxchainpairlength obj=new maxchainpairlength();
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
        Arrays.sort(arr,Comparator.comparingDouble(o ->o[1]));
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
