public class ReverseString {
    public static void main(String[] args)
    {
        String str= "Hello, world!";
        String_Reverse(str,0);
    }
    public static void String_Reverse(String str,int n)
    {
        if(n==str.length())
        {
            return;
        }
        String_Reverse(str,n+1);
        System.out.println(str.charAt(n));
    }
}
