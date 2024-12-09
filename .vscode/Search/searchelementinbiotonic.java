import java.util.Scanner;
public class searchelementinbiotonic {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the value in array");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        peekelement obj=new peekelement();
        int peek=obj.search(nums,n);
        int high=n-1;
        int low=0;
        binarysearch ob=new binarysearch();
        int fi=ob.search(nums,3,low,peek);
        descendingsorted o=new descendingsorted();
        int pp=o.search(nums,3,peek+1,high);
        System.out.println(fi+" "+pp);
        }
}
