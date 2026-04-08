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
        ListNode dummy=new ListNode(0);
        dummy.next=cuss;
        ListNode temp=dummy;
        int c=1;
        while(temp.next!=null)
        {
           if(c==n)
           {
            temp.next=temp.next.next;
            break;
           }
           temp=temp.next;
           c++;
        }
        prev=null;
        curr=dummy.next;
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