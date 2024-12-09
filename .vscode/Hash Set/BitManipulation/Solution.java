import java.util.*;
class Solution {
    public boolean reorderedPowerOf2(int n) {
        //BigInteger b1;
        //String sr="n";
       // b1=new BigInteger(sr);
       // int flag=0,s=0;
        boolean str;
        int ss=check(n);
        if(ss==1)
        {
            str=true;
        }
        else
        {
           // str=false;
            int num=checkreordered(n);
           int sss=check(num);
            if(sss!=1||num==01)
            {
                str=false;
            }
            else{
                str=true;
            }

        }
        return str;
    }
    int checkreordered(int num){
        int n=num;
        int res=0;
        while(n>0)
        {
            res=res*10+(n%10);
            n=n/10;
        }
        return res;
    }
    int check(int numb)
    {
        int flag;
        int s=0;
         int len=((int)((Math.log(numb) / Math.log(2) ) + 1));
        for (int i=0;i<=len;i++){
            int bitMask=1<<i;
            if((bitMask & numb)==0){
                flag=0;
            }
            else
            {
                s++;
            }
        }
        return s;
    }
    public static void main(String arg[]) {
        Solution obj=new Solution();
       boolean bb=obj.reorderedPowerOf2(1);
       System.out.println(bb);
    }
}
