import java.util.*;
public class missing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(arr.length==1)
        {
            System.out.println(-1);
        }
        //[1,2,4,6]
        for (int i=1; i<n; i++) {
            if(arr[i]==arr[i-1]+1||arr[i]==arr[i-1])
            {
                continue;
            }
            else
            {
                int p=arr[i-1]+1;
                while(p<arr[i])
                {
                a.add(p);
                p++;
                }
            }
        }
        System.out.println(a);
    }
}
