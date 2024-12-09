import java.util.*;
public class ZigZagInt {
        public static void main(String args[])
        {
            ZigZagInt obj=new ZigZagInt();
            System.out.println("enter the number for Zig Zag Pattern");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("   ");
            obj.printZig(n);
        }
        public void printZig(int num)
        {
            if(num==0)
            {
                return;
            }
            else
            {
                System.out.println(num);
                printZig(num-1);
                System.out.println(num);
                printZig(num-1);
                System.out.println(num);
            }
        }
    }
