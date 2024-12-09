import java.util.*;
public class twointer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size then pushing value in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        twointer obj=new twointer();
        obj.intersection(arr,n);
    }
    public void intersection(int[] arr,int n)
    {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int  i=0;i<n;i++)
        {
            sum+=arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer>list2=new ArrayList<Integer>();
        int count=n;
        int count2=0;
        int prevsum=0;
        for(int j:map.keySet())
        {
            System.out.println(j);
            if(sum>prevsum && count2<count)
            {
                for(int k=0;k<map.get(j);k++)
                {
                list2.add(j);
                }
                System.out.println(sum);
                System.out.println(prevsum);
            }
            else
            {
                 for(int k=0;k<map.get(j);k++)
                {
                list.add(j);
                }
            }
              int nn=map.get(j);
             count2+=nn;
                count-=nn;
                sum-=j*nn;
                prevsum+=j*nn;
        }
        System.out.println(list+" second \n"+list2);
    }
}
