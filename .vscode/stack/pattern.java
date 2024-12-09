/**
 * The class "pattern" in Java prints a pattern of numbers in a specific sequence.
 */
public class pattern {
    public static void main(String[] args)
    {
        int j;
        for(int i=1;i<=4;i++)
        {
           for(j=1;j<i;j++)
           {
            System.out.print(j);
           }
           for(int k=j;k>0;k--)
           {
            System.out.print(k);
           }
           System.out.println();
        }
    }
}
/*1
 121
 12321
 1234321
 */