public class Binary {
    public static void main(String[] args)
    {
        String str="011001001100";
        int count=maxEqualPair(str);
        System.out.println(count);
    }
    public static int maxEqualPair(String str)
    {
        int count=0;
        int[] contZeroOne=new int[str.length()];
        int j=1;
        int cIndex=0;
        int k=0;
        while(k<str.length())
        {
            int length=1;
            while(j<str.length()&&str.charAt(j-1)==str.charAt(j))
            {
                j++;
                length++;
            }
            k=j;
            j++;
            contZeroOne[cIndex]=length;
            cIndex++;
        }
        for(int i=1;i<contZeroOne.length;i++)
        {
            count+=Math.min(contZeroOne[i-1],contZeroOne[i]);
        }
        return count;
    }
}
