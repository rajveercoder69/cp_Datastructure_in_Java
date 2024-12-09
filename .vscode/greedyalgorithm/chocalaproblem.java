import java.util.*;
public class chocalaproblem {
    public static void main(String arg[])
    {
        Integer[] hori={2,1,3,1,4};
        Integer [] vert={4,1,2};
        Arrays.sort(hori,Comparator.reverseOrder());
        Arrays.sort(vert,Comparator.reverseOrder());
        int hp=1;
        int vp=1;
        int h=0;int v=0;
        int cost=0;
        while(h<hori.length&&v<vert.length)
        {
            if(hori[h]>=vert[v])
            {
                cost+=hori[h]*vp;
                hp++;
                h++;
            }
            else
            {
                cost+=vert[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<hori.length)
        {
             cost+=hori[h]*vp;
                hp++;
                h++;
        }
        while(v<vert.length)
        {
             cost+=vert[v]*hp;
                vp++;
                v++;
        }
        System.out.println("The minimum cost is:"+cost);
    }
}
