import java.util.*;
public class SubArrayG {
    public static ArrayList<ArrayList<Integer>> arrayList=new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the value in the array:");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        SubArrayGM(a,size,0);
        for(ArrayList<Integer> List:arrayList)
        {
            System.out.println(List);
        }
    }
    public static void SubArrayGM(int[] array, int size, int indx)
    {
        
        if(indx==size)
        {
            arrayList.add(new ArrayList<>());
            arrayList.add(List);

            return;
        }
        else if(indx<size)
        {
            SubArrayGM(array, size, indx+1);
        }
        ArrayList<Integer> List = new ArrayList<Integer>();
        for(int i=indx;i<size;i++)
        {
            List.add(array[i]);
        }
        SubArrayGM(array, size, indx+1);
    }


}
