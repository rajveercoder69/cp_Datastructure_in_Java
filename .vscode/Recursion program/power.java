public class power {
    public static void main(String arg[])
    {
        power obj=new power();
        int ny=obj.pow(2,4);
        System.out.println(ny);
    }
    public int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        else{
            int p=pow(x,n-1);
            int res=x*p;
            return res;
        }
    }
}
