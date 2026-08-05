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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode temp=prev;
        if(n==1)
        {
            temp=temp.next;
        }
        else
        {
            ListNode t=temp;
            int c=1;
            while(t!=null)
            {
                if(c==n-1)
                {
                    t.next=t.next.next;
                    break;
                }
                t=t.next;
                c++;
            }
           
        }
         prev=null;
            curr=temp;
            while(curr!=null)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        return prev;
    }
}