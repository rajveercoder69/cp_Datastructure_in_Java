
import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] array={-7,8,3,0,2};
        //for ascending order
        for (int i=0; i<array.length; i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1] = array[j];
                    array[j]=temp;
                }
            }
        }

        //for descending order
        for (int i=0; i<array.length; i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]<array[j+1])
                {
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
