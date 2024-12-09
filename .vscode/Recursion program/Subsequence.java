import java.util.*;
public class Subsequence {
    public static void main(String args[])
    {
        Subsequence obj=new Subsequence();
        String sr="raj";
       ArrayList<String> res=obj.printSub(sr);
       System.out.println(res);
    }
 public ArrayList<String>printSub(String str)
{
    if(str.length()==0)
    {
        ArrayList<String> bres=new ArrayList<String>();
        bres.add(" ");
        return bres;
    }
    else
    {
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String>rres=printSub(ros);
        ArrayList<String>mres=new ArrayList<String>();
        for(String rstr:rres )
        {
            mres.add(""+rstr);
        }
        for(String rstr:rres )
        {
            mres.add(ch+rstr);
        }
        return mres;
    }
}
}
