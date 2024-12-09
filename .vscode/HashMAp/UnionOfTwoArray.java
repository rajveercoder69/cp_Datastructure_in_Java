import java.util.*;
public class UnionOfTwoArray {
    public static void main(String arg[])
    {
        UnionOfTwoArray obj=new UnionOfTwoArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the size of array");
        int nn=sc.nextInt();
        System.out.println("Enter the array value");
        int[] arr=new int[n];
        int [] ar=new int[nn];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            ar[j]=sc.nextInt();
        }
        ArrayList<Integer> ros=obj.union(arr,ar);
        System.out.println(ros);
    }
    public ArrayList<Integer> union(int [] arr,int [] ar)
    {
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            map.add(arr[i]);
        }
        for(int j=0;j<ar.length;j++)
        {
            map.add(ar[j]);
        }
        for(int k:map)
        {
            array.add(k);
        }
        return array;
    }
}
