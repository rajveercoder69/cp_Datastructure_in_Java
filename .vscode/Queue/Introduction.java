import java.util.*;
class Introduction
{
    public static class Queue
    {
        static int rear;
        static int[] arr;
        static int size;
        public Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }
    public static boolean isEmpty()
    {
        return rear==-1;
    }
    public static void  add(int n)
    {
        if(rear==size-1)
        {
        System.out.println("Queue is full");
        return;
        }
        rear=rear+1;
        arr[rear]=n;
    }
    public static int peek()
    {
        if(isEmpty())
        {
            return  -1;
        }
        else
        {
            return arr[0];
        }
    }
    public static void remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return ;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return;
    }
}
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Queue obj=new Queue(n);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        while(!obj.isEmpty())
        {
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
