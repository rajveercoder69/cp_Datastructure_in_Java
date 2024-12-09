
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode h=head;
        ArrayList<Integer> arra=new ArrayList<>();
        int size=0;
        int max=0;
        while(h!=null)
        {
            size++;
            arra.add(h.val);
            h=h.next;
        }
        int[] arr=new int[size];
        if(size==0)
        {
           return arr; 
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arra.get(i)<arra.get(j))
                {
                    max=arra.get(j);
                    arr[i]=max;
                    break;

                }
                if(arra.get(i)==max)
                {
                    arr[i]=0;
                    max=0;
                }
            }
        }
    return arr;
    }
}
