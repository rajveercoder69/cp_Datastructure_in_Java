import java.util.*;
public class sumsubset {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int[] ar=new int[c];
        for(int i=0;i<c;i++)
        {
            ar[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        sumsubset obj=new sumsubset();
        ArrayList<String> list=obj.subset(ar,0,"",0,tar);
        System.out.println(list.size());
    }
    public ArrayList<String> subset(int[] arr,int indx,String set,int sos,int tar)
    {
        if(indx==arr.length)
        {
            if(sos==tar)
            {
                System.out.println(set+".");
                ArrayList<String> bc=new ArrayList<String>();
                bc.add(set);
            return bc;
            }
        }
        else
        {
           ArrayList<String> list=subset(arr,indx+1,set+arr[indx]+",",sos+arr[indx],tar);
           ArrayList<String> lis=subset(arr, indx+1, set, sos, tar);
           ArrayList<String> ros=new ArrayList<String>();
           for(String l:list)
           {
            ros.add(l);
           }
           for(String l:lis)
           {
            ros.add(l);
           }
          return ros;
         }
         ArrayList<String> liss=new ArrayList<>();
         return liss;
            }
}
