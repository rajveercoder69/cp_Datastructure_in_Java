import java.util.*;
public class SlectionSort {
    public static void main(String[] args)
    {
        int[] array= {7,8,3,1,2,2,-4,-7,-100};
        for (int i=0; i<array.length-1; i++)
        {
          //  int k=array[i];
            int index=i;
            for (int j=i+1; j<array.length;j++)
            {
                if(array[j]<array[index])
                {
                    //k=array[j];
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        for (int i=0; i<array.length; i++)
        System.out.print(array[i]+"\t");
    }
}
