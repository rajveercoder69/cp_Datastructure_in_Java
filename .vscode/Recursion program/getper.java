import java.util.*;
class PermutationOfStr1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        PermutationOfStr1 obj=new PermutationOfStr1();
        String s=sc.nextLine();
        ArrayList<String> strr=obj.PrintP(s,"");
        for(String strrr:strr)
        {
            final int v=Integer.parseInt(strrr);
            System.out.println("this is");
            System.out.println(v);
        }
       // System.out.println(str);
    }
    /**
     * @param qes
     * @param ans
     * @return
     */
    public ArrayList<String> PrintP(String qes,String ans)
    {
        ArrayList<String> mres=new ArrayList<String>();
        if(qes.length()==0)
        {
            //System.out.println(ans);
            ArrayList<String> bres=new ArrayList<String>();
            bres.add(ans);
            return bres;
        }
        else{
        for(int i=0;i<qes.length();i++)
        {
            char ch=qes.charAt(i);
            String pre=qes.substring(0, i);
            String post=qes.substring(i+1);
            String comb=pre+post;
            ArrayList<String> res=PrintP(comb, ans+ch);
        for(String str:res)
        {
            mres.add(str);
        }
    }
        return mres;
    }
}
    }