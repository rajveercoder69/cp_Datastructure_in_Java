import java.util.Scanner;
import java.util.*;

public class mincoinexchangeproblem {
    public static void main(String arg[])
    {
        int[] coin={5,100,500,1000,2000,10,2,50,1,20,200};
        // if coin are not sorted than firstly sort this
        Arrays.sort(coin);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rupees for exchange in Indian Rupees");
        int n=sc.nextInt();
        int j=coin.length-1;
        int  count=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0&&j>=0)
        {
            if(n>=coin[j])
            {
                list.add(coin[j]);
                count++;
                n=n-coin[j];
            }
            else
            {
                j--;
            }
        }
        System.out.println("the minimum coin required is:"+count+" \n"+"And The coins are:"+list);
    }
}
