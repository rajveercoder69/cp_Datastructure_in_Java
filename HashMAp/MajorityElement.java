import java.util.*;
public class MajorityElement {
    public HashMap<Integer,Integer> set=new HashMap<Integer,Integer>();
    public HashSet<Integer> majority(int[] ar)
    {
        HashSet<Integer> res=new HashSet<>();
        int val;
        for(int i=0;i<ar.length;i++)
        {
            int vs=ar[i];
            if(!set.containsKey(vs))
            {
                val=1;
                set.put(ar[i], val);
            }
            else{
                System.out.println(vs);
                val=set.get(ar[i])+1;
                set.put(ar[i],val);
            }
        }
        System.out.println(set);
        int prev=(ar.length)/3;
        for(int i=0;i<ar.length;i++)
        {
            int v=set.get(ar[i]);
            if(v>prev)
            {
            res.add(ar[i]);
            }
        }
        return res;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter number in the array");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        MajorityElement obj=new MajorityElement();
        HashSet<Integer> res= obj.majority(ar);
        System.out.println(res);
    }
}
