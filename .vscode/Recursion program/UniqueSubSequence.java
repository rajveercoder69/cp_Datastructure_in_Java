import java.util.*;
import java.util.HashSet;
public class UniqueSubSequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        HashSet<String> set=new HashSet<>();
        printUniqueSubsequence(st,0,set,"");
    }
    public static void printUniqueSubsequence(String str,int start,HashSet<String> set,String newString)
    {
        if(start==str.length())
        {
            if(!set.contains(newString))
            {
            System.out.println(newString);
            set.add(newString);
            return;
            }
            else
            {
            return;
            }
        }
        char currentChar=str.charAt(start);
        printUniqueSubsequence(str, start+1, set, newString+currentChar);
        printUniqueSubsequence(str, start+1, set, newString);
    }
}
