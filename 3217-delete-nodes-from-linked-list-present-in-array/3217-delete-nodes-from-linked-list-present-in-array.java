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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int t:nums)
        {
            set.add(t);
        }
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        List<Integer> res=new ArrayList<>();
        for(int t:l)
        {
            if(!set.contains(t))
            {
                res.add(t);
            }
        }
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