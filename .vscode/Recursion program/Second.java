public class Second {
    public static void main(String args[])
    {
        Second obj =new Second();
        obj.printnum(1);
    }
    public void printnum(int n){
        if(n==6)
        {
            return;
        }
        else{
            System.out.println(n);// to print the number while moving up in stack 
            printnum(n+1);
            System.out.println(n);//to give the control dessemblying the stack while moving down and printing
        }
    }
}
