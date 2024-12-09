public class fibb {
    public static void main(String args[])
    {
        fibb obj=new fibb();
        int q=0;
        int qq=1;
        int n=9;
        System.out.println(q);
        System.out.println(qq);
        obj.printfib(q,qq,n-2);
    }
    public void printfib(int a,int b,int num)
    {
        if(num==0)
        {
            return;
        }
        else{
            int c=a+b;
            System.out.println(c);
            printfib(b, c, num-1);
        }
    }
}
