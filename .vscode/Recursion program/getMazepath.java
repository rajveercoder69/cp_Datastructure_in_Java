import java.util.*;
public class getMazepath {
   public static void main(String arg[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    getMazepath obj=new getMazepath();
    ArrayList<String>paths=obj.getPath(1,1,n,m);
    System.out.println(paths.size());
    }
    public ArrayList<String> getPath(int sr,int sc,int dr,int dc)
{
    if(sr==dr&&sc==dc)
    {
        ArrayList<String> bres=new ArrayList<String>();
        bres.add("");
        return bres;
    }
    ArrayList<String>hpaths=new ArrayList<String>();
    ArrayList<String>vpaths=new ArrayList<String>();
    if(sr<dr)
    {
        vpaths=getPath(sr+1, sc, dr, dc);
    }
    if(sc<dc)
    {
        hpaths=getPath(sr, sc+1, dr, dc);
    }
    ArrayList<String>mres=new ArrayList<String>();
    for(String hpath:hpaths)
    {
        mres.add("h"+hpath);
    }
       for(String vpath:vpaths)
    {
        mres.add("v"+vpath);
    }
    return mres;
}
}
