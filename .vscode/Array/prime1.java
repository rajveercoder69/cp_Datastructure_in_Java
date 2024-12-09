import java.util.*;
class prime1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
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
            System.out.print("none");
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
 
                // lcm_of_array_elements (n1, n2, ... 0) = 0.
                // For negative number we convert into
                // positive and calculate lcm_of_array_elements.
 
                if (element_array[i] == 0) {
                    return 0;
                }
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }
 
                // Divide element_array by devisor if complete
                // division i.e. without remainder then replace
                // number with quotient; used for find next factor
                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }
 
            // If divisor able to completely divide any number
            // from array multiply with lcm_of_array_elements
            // and store into lcm_of_array_elements and continue
            // to same divisor for next factor finding.
            // else increment divisor
            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }
 
            // Check if all element_array is 1 indicate 
            // we found all factors and terminate while loop.
            if (counter == element_array.length) {
                return lcm_of_array_elements;
            }
        }
}
}