import java.util.*;
class usingstackasque
{
    public static class Queue
    {
        static Stack<Integer>s1=new Stack<Integer>();
        static Stack<Integer>s2=new Stack<Integer>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int n)
        {
           while(!s1.isEmpty())
           {
            s2.push(s1.pop());
           }
           s1.push(n);
           while(!s2.empty())
           {
            s1.push(s2.pop());
           }
        }
        public static int peek()
        {
            if(s1.empty())
            {
                return -1;
            }
            return s1.peek(); 

        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
    }
    public static void main(String arg[])
    {
        Queue obj=new Queue();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        while(!obj.isEmpty())
        {
            System.out.println("this:"+obj.peek());
            obj.remove();
        }
        char ch='b';
        System.out.println(ch-'a');
    }
}
