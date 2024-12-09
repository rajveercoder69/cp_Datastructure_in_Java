import java.util.*;
class factorial{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial obj=new factorial();
       int num= obj.fact(n);
       System.out.println(num);
    }
    public int fact(int nu)
    {
        if(nu==1||nu==0)
        {
            return 1;
        }
        else{
            int de=fact(nu-1);
            int fa=nu*de;
            return fa;
        }
    }
}
