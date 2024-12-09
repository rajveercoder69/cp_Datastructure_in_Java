import java.util.*;
public class freq {
    public static void main(String args[])
    {
        int [] arr={1,2,2,3,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            ans.add(even.size()!=0?even.get(j):odd.get(j));
        }
        System.out.println(ans);
    }
}
