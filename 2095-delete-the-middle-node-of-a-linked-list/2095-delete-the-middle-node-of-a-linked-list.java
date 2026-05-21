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
    public ListNode deleteMiddle(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        int mid=l.size()/2;
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(i<l.size())
        {
            if(i!=mid)
            {
                res.add(l.get(i));
            }
            i++;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int j=0;
        while(j<res.size())
        {
            ListNode t=new ListNode(res.get(j));
            curr.next=t;
            curr=curr.next;
            j++;

        }
        return dummy.next;
    }
}