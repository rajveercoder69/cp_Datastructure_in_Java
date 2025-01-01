public class StrictlyIncreasingSorted {
    public static int checker;
    public static  void main(String[] args)
    {
        int[] array={-45545554,-4532322,1,2,3,4,5};
       checker = array[0];
        if(isSortedIncreasingly(array,1))
        {
            System.out.println("Array is StrictlyIncreasingSorted");
        }
        else
        {
            System.out.println("Array is Not StrictlyIncreasingSorted");
        }
    }
    public static boolean isSortedIncreasingly(int[] array,int indx)
    {
        if(indx==array.length)
        {
        return true;
        }
        if(checker<array[indx])
        {
            checker = array[indx];
            return isSortedIncreasingly(array, indx+1);
        }
        else
        {
            System.out.println(checker);
            return false;
        }
    }
}

