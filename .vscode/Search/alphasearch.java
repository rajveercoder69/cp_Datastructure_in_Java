import java.util.*;
class alphasearch
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the character");
        char[] ch=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        alphasearch obj=new alphasearch();
        System.out.println(obj.search(ch,n,'f'));
    }
    public char search(char[] ch,int size,char tc)
    {
        int min=0;
        int max=size-1;
        char res='#';
        while(min<=max)
        {
            int mid=min+(max-min)/2;
            if(ch[mid]==tc)
            {
                min=mid+1;
            }
            else if(ch[mid]>tc)
            {
                res=ch[mid];
                max=mid-1;
            }
            else 
            {
                min=mid+1;
            }
        }
        return res;
    }
}