import java.util.*;
public class slidingwindowmaxsubarray
{
public static class Window implements Comparable<Window>
{
    int value;
    int idx;
    public Window(int value,int idx)
    {
        this.value=value;
        this.idx=idx;
    }
    @Override
    public int compareTo(Window w)
    {
        return this.value-w.value;
    }
}
public static void main(String arg[])
{
    int[] arr={1,3,-1,-3,5,3,6,7};
    int k=3;
    slidingwindowmaxsubarray obj=new slidingwindowmaxsubarray();
    int[] ar=obj.maxSlidingWindow(arr,k);
    for(int i=0;i<ar.length;i++)
    {
        System.out.print(ar[i]+" ");
    }
}
public int[] maxSlidingWindow(int[] nums, int k) {
    int [] max=new int[nums.length-k+1];
    PriorityQueue<Window> pq=new PriorityQueue<Window>(Comparator.reverseOrder());
    int i;
    for(i=0;i<k;i++)
    {
        pq.add(new Window(nums[i],i));
    }
    max[0]=pq.peek().value;
    int l=1;
    for(int j=i;j<nums.length;j++)
    {
        if(pq.size()>0 && pq.peek().idx<=(j-k))
        {
            while(pq.size()>0 && pq.peek().idx<=(j-k))
            {
                pq.remove();
            }
        }
        pq.add(new Window(nums[j],j));
        max[l]=pq.peek().value;
        l++;
    }
    return max;
}
}