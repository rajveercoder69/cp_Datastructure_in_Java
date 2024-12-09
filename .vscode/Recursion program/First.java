public class First {
    public static void main(String args[])
    {
        First obj=new First();
        obj.func(5);
    }
   void func(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
}
