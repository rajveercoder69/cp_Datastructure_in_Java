import java.util.*;
class prime2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        String[] arrOfStr = st.split(" ");
        int n=arrOfStr.length;
        int []a=new int[n];
        for (int i=0; i<n; i++)
        {
            a[i]=Integer.valueOf(arrOfStr[i]);
        }
        int q=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            q=Math.min(q,a[i]);
        }
        int[]r=new int[n-1];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==q)
            {
                continue;
            }
            else
            {
            r[k]=a[i];
            k++;
            }
        }
        long p=lcm_of_array_elements(r);
        p=p+q;
        if(check(p))
        {
            System.out.print(p);
        }
        else
        {
            System.out.print("None");
        }
    }
    public static boolean check(long p)
    {
        for(int i=2;i<=Math.sqrt(p);i++)
        {
            if(p%i==0)
            return false;
        }
        return true;
    }
    public static long lcm_of_array_elements(int[] element_array)
    {
        long lcm_of_array_elements = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < element_array.length; i++) {
 
                
 
                if (element_array[i] == 0) {
                    return 0;
                }
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }
 
              
                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }
 
          
            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }
 
            
            if (counter == element_array.length) {
                return lcm_of_array_elements;
            }
        }
}
}