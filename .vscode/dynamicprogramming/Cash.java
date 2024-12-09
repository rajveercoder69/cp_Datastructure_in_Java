import java.util.*;
public class Cash {
    static int l;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cash collection num ");
        int num=sc.nextInt();
        int [] cash=new int[num];
        System.out.println("Enter the withdrawal feed");
        for(int i=0; i<cash.length; i++)
        {
            cash[i]=sc.nextInt();
        }
        l=(int)Math.pow(10,9);
        System.out.println("Enter the amount of cash withdrawal");
        int amount=sc.nextInt();
        Cash obj=new Cash();
       int n=obj.backtrack(0,num-1,amount,cash);
        if(n>=l)
       {
        System.out.println("-1");
       }
       else
       {
       System.out.println(n);
       }
    }
    public int backtrack(int front,int back,int amount,int[] cash)
    {
        if(amount==0)
        {
            return 0;
        }
        if(front>back||amount<0)
        {
            return l;
        }
        return Math.min(1+backtrack(front+1,back,amount-cash[front],cash),1+backtrack(front,back-1,amount-cash[back],cash));
    }
}
