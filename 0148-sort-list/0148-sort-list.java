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
    public ListNode sortList(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        Collections.sort(l);
        ListNode dummy =new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<l.size();i++)
        {
            ListNode t=new ListNode(l.get(i));
            temp.next=t;
            temp=temp.next;
        }
        return dummy.next;
    }
}