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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> dup=new HashSet<>();
        ListNode curr=head;
        while(curr!=null)
        {
            if(!set.contains(curr.val)&&!dup.contains(curr.val))
            {
            set.add(curr.val);
            }
            else
            {
                set.remove(curr.val);
                dup.add(curr.val);
            }
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        curr=head;
        while(head!=null)
        {
            if(set.contains(head.val))
            {
                dummy.next=new ListNode(head.val);
                dummy=dummy.next;
            }
            head=head.next;
        }
        return res.next;
    }
}