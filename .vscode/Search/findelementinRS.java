import java.util.*;
public class findelementinRS {
    public static void  main(String args[])
    {
        findelementinRS obj=new findelementinRS();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nsize and nrotatedsorted array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int nn=arr.length;
        System.out.println(obj.searchnrotatedarray(arr,nn));
    }
    public int searchnrotatedarray(int [] arr,int n)
    {
        int min=0;
        int max=n-1;
        int mid=0;
        while(min<=max)
        {
            mid=min+(max-min)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
            {
               return mid;
            }
            else if(arr[mid]>=arr[min])
            {
            min=mid+1;
            }
            else if(arr[mid]<=arr[max])
            {
                max=mid-1;
            }
        }
        return 0;
    }
}
