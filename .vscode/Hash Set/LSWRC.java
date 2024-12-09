
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int l=0;
        int r=0;
        char[] ch=s.toCharArray(); 
        HashSet<Character> set=new HashSet<Character>();
        while(r<s.length())
        {
            if(!set.contains(ch[r]))
            {
                set.add(ch[r]);
                if((r-l+1)>len){
                        len=r-l+1;
                        }
                r++;
            }
            else if(set.contains(ch[r]))
            {
                while(set.contains(ch[r]))
                {
                        set.remove(ch[l]);
                        l++;
                        if((r-l+1)>len){
                        len=r-l+1;
                        }
                    }
            }
            else  if(l==1)
            {
                set.add(ch[r]);
                r++;
                len=r-l+1;
            }
            }
       return len;
    }
}
class LSWRC{
 public static void main(String args[])
 {
  Solution obj=new Solution();
  System.out.println("The Longest substring without repeating character is of length:");
  System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
 }
}