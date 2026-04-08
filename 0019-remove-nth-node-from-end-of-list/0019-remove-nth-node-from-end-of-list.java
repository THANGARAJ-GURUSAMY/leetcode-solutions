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
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode cuss=prev;
        if(n==1)
        {
            cuss=cuss.next;
        }
        else
        {
            ListNode temp=cuss;
            int c=1;
            while(temp!=null&&temp.next!=null)
            {
                if(c==n-1)
                {
                    temp.next=temp.next.next;
                    break;
                }
                temp=temp.next;
                c++;
            }
        }
        prev=null;
        curr=cuss;
        while(curr!=null)
        {
            ListNode nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        return prev;
      
        
    }
}