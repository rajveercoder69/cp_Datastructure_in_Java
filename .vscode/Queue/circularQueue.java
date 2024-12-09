import java.util.*;
class circularQueue
{
    public static class Queue
    {
        static int rear;
        static int[] arr;
        static int size;
        static int front;
        public Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
    public static boolean isEmpty()
    {
        return rear==-1&& front==-1;
    }
    public static void  add(int n)
    {
        if((rear+1)%size==front)
        {
        System.out.println("Queue is full");
        return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear=(rear+1)%size;
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
            return arr[front%size];
        }
    }
    public static void remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return ;
        }
        int result=arr[front];
        if(rear==front)
        {
            rear=front=-1;
        }
        else
        {
        front=(front+1)%size;
        }
        return ;
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
