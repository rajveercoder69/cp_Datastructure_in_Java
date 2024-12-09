import java.util.*;
class civi1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  seq=sc.nextLine();
        String st=sc.nextLine();
        int n=seq.length();
        int nn=st.length();
        seq=seq.toLowerCase();
        st=st.toLowerCase();
        HashMap<Character, Integer> stt=new HashMap<Character, Integer>();
        for (int i=0; i<st.length(); i++)
        {
            char ch=st.charAt(i);
            stt.put(ch,stt.getOrDefault(ch,0)+1);
           // System.out.println(ch);
        }
        //System.out.println(stt);
        String sans="";
        String nans="";
        String spans="";
        int l=0;
        int ll=1;
        int lll=1;
        HashMap <Character, Integer> seqt=new HashMap<Character, Integer>();
        for(int i=0; i<n; i++)
        {
            char c=seq.charAt(i);
            seqt.put(c,seqt.getOrDefault(c,0)+1);
            if(!seqt.isEmpty() && seqt.get(c)>1)
            {
                System.out.print("New Language Error");
                l=1;
                break;
            }
            if (c >= '0' && c<= '9')
            {
               // System.out.print("New Language Error");
                if(stt.containsKey(c))
                {
                     ll=0;
                    int k=stt.get(c);
                    while(k>0)
                    {
                        nans=nans+c;
                        k--;
                    }
                }
            }
           else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
           {
             if(stt.containsKey(c))
                {
                    int k=stt.get(c);
                    while(k>0)
                    {
                        sans=sans+c;
                        k--;
                    }
                }
           }
           else if(!Character.isLetterOrDigit(c))
           {
             if(stt.containsKey(c))
                {
                     lll=0;
                    int k=stt.get(c);
                    while(k>0)
                    {
                        spans=spans+c;
                        k--;
                    }
                }
           }
        }
        if(l==0)
        {
        if(stt.containsKey(' '))
        {
            if(ll==0&&lll==0)
            System.out.print(sans+" "+nans+" "+spans);
            else if(ll==1&&lll==0)
            {
                 System.out.print(sans+" "+spans);
            }
            else
            {
                 System.out.print(sans+" "+nans);
            }
        }
        else
        {
           if(ll==0&&lll==0)
            System.out.print(sans+nans+spans);
            else if(ll==1&&lll==0)
            {
                 System.out.print(sans+spans);
            }
            else
            {
                 System.out.print(sans+nans);
            }
        }
    }
    }
}