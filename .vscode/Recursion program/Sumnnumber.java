class  Sumnnumber
{
    public static void main(String args[])
    {
        Sumnnumber obj=new Sumnnumber();
        obj.printsum(1,5,0);
    }
    public void printsum(int i,int n,int sum){
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        else{
            sum+=i;
            printsum(i+1,n,sum);
        }
    }
}