import java.io.IOException;
import java.util.*;
public class Augistin {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int sum=Integer.parseInt(input);
        int j;
        int ind=0;
        for(int i=0;i<input.length()-1;i++)
        {
            String n=input.substring(0,i+1);
            String nn=input.substring(i+1,input.length());
            j=Integer.parseInt(n)+Integer.parseInt(nn);
            char ch=input.charAt(i);
            ind+=ch-'0';
            //System.out.println(j+"\t"+n+"\t"+nn+"\t"+ind);
            sum=sum+j;
            j=0;
        }
        char ch=input.charAt(input.length()-1);
        ind+=ch-'0';
        sum+=ind;
        String res=String.valueOf(sum);
        System.out.println(res);
    }
}
