public class Stackheoghtinlog {
    public static void main(String args[])
    {
        Stackheoghtinlog obj=new Stackheoghtinlog();
        int num=obj.loheight(2,4);
        System.out.println(num);
    }
    public int loheight(int x,int n)
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
            if(n%2==0)
            {
                return loheight(x, n/2)*loheight(x, n/2);
            }
            else
            {
                return loheight(x, n/2)*loheight(x, n/2) *x;
            }
        }
    }
}
