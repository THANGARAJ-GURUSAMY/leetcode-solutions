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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
        {
             return head;

        }
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0)
        {
            return head;
        }
        int move=count-k;
        temp=head;
        for(int i=1;i<move;i++)
        {
            temp=temp.next;
        }
        ListNode newNode=temp.next;
        temp.next=null;
        ListNode tail=newNode;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=head;
        return newNode;
    }
}