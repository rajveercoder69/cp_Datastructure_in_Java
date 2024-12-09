import java.util.*;
public class LongestSubstringvowel {
    public static void main(String args[])
    {
        LongestSubstringvowel obj=new LongestSubstringvowel();
        String ss="aeirtsbhfous";
        int n=obj.maxVowels(ss, 3);
        System.out.println(n);
    }
    public int maxVowels(String s, int k) {
        int p=k;int prevmax=0;int max;
        for(int i=0;i<s.length();i++)
        {
            if(p>s.length())
            {
                break;
            }
            else
            {
                String str=s.substring(i,p);
                max=check(str,k);
                p++;
                if(prevmax<max)
                {
                    prevmax=max;
                }
            }
        }
        return prevmax;
    }
    public int check(String st,int nn)
    {
        int sp=0;
        for(int i=0;i<nn;i++)
        {
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
            {
                sp++;
            }
        }
        return sp;
    }
}

