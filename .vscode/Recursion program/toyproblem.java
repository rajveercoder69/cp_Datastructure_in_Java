import java.util.*;
public class toyproblem {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        toyproblem obj=new toyproblem();
        System.out.println("ENter the target");
        int target=sc.nextInt();
        ArrayList<String> PP=obj.toy(arr,n,target," " );
        int counter=0;
        for(String K:PP)
        {
            if(K.length()>2)
            {
               counter++;
            }
        }
        System.out.println(counter);
    }
    public ArrayList<String> toy(int [] arr,int n,int target,String s)
    {
        if(n==0)
        {
            if(target==0)
        {
            ArrayList<String>bc=new ArrayList<String>();
            bc.add(s);
            return bc;
        }
        }
        else
        {
        ArrayList<String> first=toy(arr,n-1,target,s);
        ArrayList<String> second=toy(arr,n-1,target-arr[n-1],s+arr[n-1]);
        ArrayList<String> res=new ArrayList<>();
        for(String j:first)
        {
            res.add(j);
        }
        for(String j:second)
        {
            res.add(j);
        }
        return res;
        }
        ArrayList<String> es=new ArrayList<String>();
        return es;
    }
    }


