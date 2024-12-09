import java.util.*;
public class Intersection {
    public static void main(String arg[])
    {
        Intersection obj=new Intersection();
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
        for(int j=0;j<nn;j++)
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
            if(map.contains(ar[j]))
            {
                map.remove(ar[j]);
            }
            else
            {
                map.add(ar[j]);
            }
        }
        for(int k:map)
        {
            array.add(k);
        }
        return array;
    }
}
