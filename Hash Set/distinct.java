import java.util.*;
public class distinct {
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        System.out.println("Distinct Set :" + calculate(S));
    }
    public static int calculate(String S)
    {
        if(S.length()<=2)
        return 0;
        else
        {
        HashSet<String> s= new HashSet<>();
        for(int i=0;i<S.length()-1;i++)
        {
            String s1=S.substring(0,i)+S.substring(i+2);
            s.add(s1);
        }
        System.out.println("Distinct Set :"+ s);
        return s.size();
    }
    }
}
