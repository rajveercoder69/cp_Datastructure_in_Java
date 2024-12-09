import java.util.HashSet;
import java.util.Iterator;
class H
{
    /**
     * @param args
     */
    public static void main(String args[]) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        if(set.contains(1))
        {
            System.out.println("Does not exit");
        }
    }
}
