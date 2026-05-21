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
    public ListNode removeNodes(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        List<Integer> res=new ArrayList<>();
        int max = 0;
        for (int i = l.size() - 1; i >= 0; i--) {

            if (l.get(i) >= max) {

                res.add(l.get(i));

                max = l.get(i);
            }
        }
        Collections.reverse(res);

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int i=0;
        while(i<res.size())
        {
            ListNode t=new ListNode(res.get(i));
            curr.next=t;
            curr=curr.next;
            i++;
        }
        return dummy.next;
        
    }
}