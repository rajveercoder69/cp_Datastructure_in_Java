public class RunnableUndertanding 
{
    public static void main(String[] args)
    {
        Runnable obj=()->
        {
                for (int i=0; i<10; i++)
                {
                    System.out.println("Hi Thread");
                    try {Thread.sleep(i*10);} catch(Exception e) {System.out.println(e.getMessage());}
                }
        };
        Runnable obj2=()-> 
        {
            for (int i=0; i<10; i++)
            {
                System.out.println("Hello Thread");
                try {Thread.sleep(i*10);} catch(Exception e) {System.out.println(e.getMessage());}
            };
        };
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}

