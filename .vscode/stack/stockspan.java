import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class stockspan {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the value  in Array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        stockspan obj=new stockspan();
        ArrayList<Integer> list=obj.reve(nums,n);
        System.out.println("This is ngr of nums:"+list);
    }
    public ArrayList<Integer> reve(int []arr,int n)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            if(stack.empty())
            {
                list.add(-1);
            }
            else if(stack.size()>0&&arr[stack.peek()]>arr[i])
            {
                list.add(stack.peek());
            }
            else if(stack.size()>0&& arr[stack.peek()]<arr[i])
            {
                while(stack.size()>0&&arr[stack.peek()]<arr[i])
                {
                    stack.pop();
                }
                if(stack.size()<=0)
                {
                    list.add(-1);
                }
                else
                {
                    list.add(stack.peek());
                }
            }
            stack.push(i);
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        int k=0;
        for(int j:list)
        {
            res.add((k-j));
            k++;
        }
        return res;
    }
}
