import java .util.*;
class minstack
{
    Stack<Integer>s;
    Stack<Integer> ss;
    public minstack()
    {
        s=new Stack<Integer>();
        ss=new Stack<Integer>();
    }
    public static void main(String arg[])
    {
        minstack obj=new minstack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
            obj.push(num[i]);
        }
        int p=obj.getmin();
        int q=obj.pop();
        q=obj.pop();
        q=obj.pop();
        p=obj.getmin();
        System.out.println("this is min in stack:"+p);
        System.out.println("this is pop in stack:"+q);
    }
    public int getmin()
    {
        if(s.size()==0)
        {
            return -1;
        }
        else
        {
            return ss.peek();
        }
    }
    public int pop()
    {
        int nn=-1;
        if(s.size()==0)
        {
            return nn;
        }
        else if(s.size()>0&&s.peek()>ss.peek())
        {
            int n=s.peek();
            s.pop();
            return n;
        }
        else if(s.size()>0&& s.peek()==ss.peek())
        {
            nn=ss.peek();
            ss.pop();
            s.pop();
        }
            return nn;
    }
    public void push(int n)
    {
        s.push(n);
        if(ss.size()<=0)
        {
            ss.push(n);
        }
        if(s.size()>0&& n<=ss.peek())
        {
            ss.push(n);
        }
    }
}