import java.util.*;

public class swapoftwoadjacent {
    ListNode head;
    public static void main(String arg[])
    {
        swapoftwoadjacent obj=new swapoftwoadjacent();
        ListNode ll=new ListNode();
        ListNode hed=new ListNode();
       ll= obj.addf(1,ll);
        ll=obj.addf(2,ll);
        ll=obj.addf(3,ll);
       ll=obj.addf(4,ll);
       while(ll.next!=null)
       {
        ll=ll.next;
        System.out.println(ll.val);
       }
       System.out.println("this");
        hed = obj.swapPairs(ll);
       while(hed.next!=null)
       {
        System.out.println(hed.val);
       }
    }
    public ListNode addf(int val,ListNode h)
    {
        ListNode ll=new ListNode();
        if(head==null)
        {
            ll.val=val;
            ll.next=null;
            head=ll;
            return head;
        }
        else{
            while(ll.next!=null)
            {
                ll=ll.next;
            }
            ll.val=val;
            ll.next=head;
            head=ll;
        }
        return head;
    }
  public static class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode swapPairs(ListNode he) {
        if(he== null || he.next == null)return he;
        ListNode d = new ListNode(0), a;
        d.next = he;
        a=d;
        while(he!=null&&he.next!=null) {
            a.next = head.next;
            head.next = head.next.next;
            a.next.next = he;
            a = a.next.next;
            he =  head.next;
        }
        return d.next;
    }
}

