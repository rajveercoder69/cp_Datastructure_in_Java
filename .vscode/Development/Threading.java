public class Threading {
    public static void main(String[] args)
    {
        A obj=new A();
        B objB=new B();
        obj.start();
       // obj.run();
       // obj.show();
        objB.start();
      //  objB.run();
       // objB.show();

    }
}
class A extends Thread 
{
   
    public void run()
    {
        for(int i = 0; i<=100;i++)
        {
            System.out.println("Rajveer: Learning in class A");
        }
    }
}
class B extends Thread
{
   
    public void run()
    {
        for(int i = 0; i<=100;i++)
        {
            System.out.println("Rajveer: Learning in class B");
        }
    }
}
