import java.util.*;
public class tcstoyproblem {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        tcstoyproblem obj=new tcstoyproblem();
        System.out.println("Enter the number");
        int target=sc.nextInt();
        int p=obj.search(arr,n,target);
        for(int j=0;j<n;j++)
        {
            if(p==arr[j])
            {
                System.out.println("THIS time needed:"+j);
                break;
            }
            if(j==n-1)
            {
                System.out.println("this time:"+-1);
            }
        }
    }
    public int  search(int [] arr,int n,int target)
    {
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(target-arr[i]==0)
            {
            set.add(0);
            }
            else{
                set.add((arr[i]));
            }
        }
        for(int j=0;j<n;j++)
        {
            int sub=target-arr[j];
            if(set.contains(sub))
            {
                return sub;
            }
        }
    return -1;
    }
}
