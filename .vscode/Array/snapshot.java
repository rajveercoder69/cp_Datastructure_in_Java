import java.util.*;
class snapshot
{
    public static class Solution
    {
        int snap_id=0;
        HashMap<Integer,Integer>[] list;
    public void snapshot(int n)
    {
        int i=-1;
        list=new HashMap[n];
        for(int j=0;j<n;j++)
        {
            list[j]=new HashMap<Integer,Integer>();
            list[j].put(0,0);
        }
    }
    public void set(int index,int val)
    {
       list[index].put(snap_id,val);
    }
    public int snapid()
    {
        return snap_id++;
    }
    public int get(int index,int snapid)
    {
      return list[index].get(snapid);
    }
}
}