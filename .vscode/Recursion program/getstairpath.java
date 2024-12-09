import java.util.*;
public class getstairpath {
    public static void main(String args[])
    {
        getstairpath obj=new getstairpath();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> paths=obj.getpaths(n);
        System.out.println(paths);
    }
    public ArrayList<String> getpaths(int nn)
    {
        if(nn==0)
        {
            ArrayList<String>bres=new ArrayList<String>();
            bres.add(" ");
            return bres;
        }
        else if(nn<0)
        {
            ArrayList<String>bres=new ArrayList<String>();
            return bres;
        }
        else
        {
            ArrayList<String> path1=getpaths(nn-1);
            ArrayList<String> path2=getpaths(nn-2);
            ArrayList<String> path3=getpaths(nn-3);
            ArrayList<String>paths=new ArrayList<String>();
            for(String path:path1)
            {
                paths.add(1+path);
            }
            for(String path:path2)
            {
                paths.add(2+path);
            }
            for(String path:path3)
            {
                paths.add(3+path);
            }
         return paths;

        }
          }
}
