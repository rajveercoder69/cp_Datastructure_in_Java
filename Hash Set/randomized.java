import java.util.*;
public class randomized {
    public static void main(String[] args)
    {
        RandomizedSet obj=new RandomizedSet();
        boolean b=obj.insert(1);
        boolean c=obj.remove(1);
        int n=obj.getRandom();
        System.out.println("inserted "+ b);
        System.out.println("deleted "+ c);
        System.out.println("get random value"+ n);
    }
}
class RandomizedSet {
    private HashSet<Integer> set;
    public RandomizedSet() {
        set=new HashSet<>();
    }
    public boolean insert(int val) {
        int prev=set.size();
        set.add(val);
        if(set.size()>prev)
        return true;
        else
        return false;
    }
    public boolean remove(int val) {
        if(!set.contains(val))
        return false;
        set.remove(val);
        if(set.contains(val))
        return false;
        else
        return true;
    }
    public int getRandom() {
        ArrayList<Integer> random = new ArrayList<Integer>(set);
        if(random.size()==0)
        return -1;
        Random rand = new Random();
        int n=rand.nextInt(random.size());
        return random.get(n);
    }
}
