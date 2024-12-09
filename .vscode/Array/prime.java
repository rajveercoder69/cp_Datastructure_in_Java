import java.util.*;
class prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] input=new int[n];
    for(int i=0;i<n;i++)
    {
      input[i]=sc.nextInt();
    }
    int q=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
     q=Math.min(q,input[i]);
    }
    int l=(int) Math.sqrt( Integer.MAX_VALUE);
    boolean prime[]=new boolean[l];
    for(int i=0;i<l;i++)
      prime[i]=true;
    for(int p=2;p*p<l;p++)
    {
     if(prime[p]==true)
     {
       for(int i=p*p;i<l;i+=p)
         prime[i]=false;
     }
    }
    int qq=0;
    for(int i=2;i<l;i++)
    {
      if(prime[i]==true)
      {
        if(check(i,input,q))
        {
          System.out.print(i);
           qq=1;
          break;
        }
        else
        {
            continue;
        }
      }
    }
    if(qq==0)
    System.out.print("none");
  }
  public static boolean check(int pr,int[] input,int rem)
  {
    for(int i=0;i<input.length;i++)
    {
        if(input[i]==rem)
        {
            continue;
        }
        else
        {
      if(pr%input[i]==rem)
      {
        continue;
      }
        else
        {
        return false;
        }
        }
    }
    return true;
  }
}