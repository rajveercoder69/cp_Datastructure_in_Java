public class FirstOccurenece {
    public static void main(String args[])
    {
        FirstOccurenece obj=new FirstOccurenece();
        int[] arr={2,3,46,74,4,3};
        int indx=0;
        obj.check(arr,indx);
    }
    public void check(int[] ar,int ind)
    {
        if(ind==ar.length)
        {
            return;
        }
        else
        {
            int s=recheck(ar,0,ar[ind],0,ind);
             if(s>2)
            {
                //System.out.println(s);
                //check(ar,ind+1);
                ind=ar.length;
                return;
            }
            else
            {
                check(ar,ind+1);
            }
        }
    }
    public int recheck(int[]a,int id,int val,int ss,int index)
    {
        int p=0;
        if(id==a.length)
        {
            return 0;
        }
        else
        {
            if(val==a[id])
            {
                ss++;
                if(ss==2)
                {
                System.out.println(index);
                id=a.length;
                return ss;
                }else
             recheck(a,id+1,val,ss,index);
            }
            else
            {
            recheck(a,id+1,val,ss,index);
            }
        }
        return p;
    }
}
