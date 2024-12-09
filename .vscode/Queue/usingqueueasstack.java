import java.util.*;
public class usingqueueasstack
{
    public static class Stack
    {
       static Queue<Integer> s1=new LinkedList<>();
       static Queue<Integer> s2=new LinkedList<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty()&&s2.isEmpty();
        }
        public static void add(int n)
        {
            if(!s1.isEmpty())
            {
            s1.add(n);
             } else{
            s2.add(n);
             }
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack isEmpty");
                return -1;
            }
            int top=-1;
            if(!s1.isEmpty())
            {
           while(!s1.isEmpty())
           {
            top=s1.remove();
            s2.add(top);
           }
            }
           else
           {
            while(!s2.isEmpty())
            {
                top=s2.remove();
                s1.add(top);
            }
         }
         return top;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Stack isEmpty");
                return -1;
            }
            int top=-1;
            if(!s1.isEmpty())
            {
                while(!s1.isEmpty())
                {
                    top=s1.poll();
                    if(s1.isEmpty())
                    {
                    break;
                    }
                    s2.add(top);
                }
            }
           else
           {
            while(!s2.isEmpty())
            {
             top=s2.poll();
             if(s2.isEmpty())
             {
                 break;
             }
             s1.add(top);
            }
         }
         return top;
    }
}
    public static void main(String arg[])
    {
        Stack obj=new Stack();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        while(!obj.isEmpty())
        {
            System.out.println("this:"+obj.remove());
        }

    }
}
