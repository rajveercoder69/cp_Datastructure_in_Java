import java.util.*;
class PermutationOfStr
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        PermutationOfStr obj=new PermutationOfStr();
        String s=sc.nextLine();
        obj.PrintP(s,"");
    }
    /**
     * @param qes
     * @param ans
     * @return
     */
    public void PrintP(String qes,String ans)
    {
        if(qes.length()==0)
        {
            ArrayList<String> str=new ArrayList<String>();
            str.add(ans);
            System.out.println(str);
            return ;
        }
        else{
        for(int i=0;i<qes.length();i++)
        {
            char ch=qes.charAt(i);
            String pre=qes.substring(0, i);
            //System.out.println(pre);
            String post=qes.substring(i+1);
            String comb=pre+post;
           PrintP(comb, ans+ch);
        }
    }
}
    }