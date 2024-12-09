import java.util.Arrays;
import java.util.Comparator;

public class fractionalknapsackproblem {
    public static void main(String arg[])
    {
        int[] val={60,100,120};
        int [] weight={10,20,30};
        int max=50;
        fractionalknapsackproblem obj=new fractionalknapsackproblem();
       obj.maximumval(val,weight,max); 
    }
    public void maximumval(int[] val,int[] weight,int max)
    {
        double[][] arr=new double[val.length][2];
        for(int i=0;i<val.length;i++)
        {
            arr[i][0]=i;
            arr[i][1]=val[i]/weight[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        int capacity=0;
        for(int i=val.length-1;i>=0;i--)
        {
            int index=(int)arr[i][0];
            if(weight[index]<=max)
            {
                capacity+=val[index];
                max=max-weight[index];
            }
            else
            {
                capacity+=max*arr[i][1];
                max=0;
                break;
            }
        }
        System.out.println(capacity);
    }
}
