public class MoveElementToEnd {
    public static int count;
    public static String movedElement="";
    public static void main(String[] args)
    {
        String str="abcxdefghxxxghij";
        char element='x';
        System.out.println("AfterMoveElement-'x'-ToEnd of word:-" +printString(str,element,0));
    }
    public static String printString(String str,char element,int start)
    {
        if(start==str.length())
        {
            for(int i=0;i<count;i++)
            movedElement=movedElement.concat("x");
            return movedElement;
        }
        else if(str.charAt(start)=='x')
        {
            count++;
            return printString(str, element, start+1);
        }
        else
        {
            movedElement=movedElement+str.charAt(start);
            return printString(str, element, start+1);
        }
    }
}
