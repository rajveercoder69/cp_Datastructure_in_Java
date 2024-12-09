import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class ngr {
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
        ngr obj=new ngr();
        ArrayList<Integer> list=obj.reve(nums,n);
        System.out.println("This is ngr of nums:"+list);
    }
    public ArrayList<Integer> reve(int[] arr,int n)
    {
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(stack.empty())
            {
                list.add(-1);
            }
            else if(stack.size()>0&& stack.peek()>arr[i])
            {
                list.add(stack.peek());
            }
            else if(stack.size()>0&& stack.peek()<=arr[i])
            {
                while(stack.size()>0 && stack.peek()<=arr[i])
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
            stack.push(arr[i]);
        }
        Stack<Integer> st=new Stack<Integer>();
        for(int j:list)
        {
            st.push(j);
        }
        list=new ArrayList<Integer>();
        while(!st.empty())
        {
            list.add(st.peek());
            st.pop();
        }
        return list;
    }
}
