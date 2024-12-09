import java.util.*;

import swapoftwoadjacent.ListNode;
public class Implement {
    Node head;
    private int size;
    Implement()
    {
        size=0;
    }
    public class Node{
        int val;
        Node next;
         public Node(int val)
         {
            this.val=val;
            this.next=null;
            size++;
         }
    }
    public void addFirst(int n)
    {
        Node node=new Node(n);
        node.next=head;
        head=node;
    }
    public void addLast(int n)
    {
        Node ll=new Node(n);
        Node l=head;
        if(head==null)
        {
            head=ll;
            size++;
            return;
        }
        else
        {
            while(l.next!=null)
            {
                l=l.next;
            }
            l.next=ll;
        }
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        Node lk=head;
        while(lk!=null)
        {
            System.out.println(lk.val);
            lk=lk.next;
        }
        System.out.println(size);
    }
    public static void main(String arg[])
    {
        Implement list=new Implement();
        list.addFirst(1);
        list.addFirst(22);
        list.addLast(2);
        list.addLast(3);
        list.addLast(1);
        list.addLast(3);
        list.printList();
    }
}
