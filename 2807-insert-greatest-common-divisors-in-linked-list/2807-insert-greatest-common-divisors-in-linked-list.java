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
    static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        while(curr!=null&&curr.next!=null)
        {
            int n1=curr.val;
            int n2=curr.next.val;
            int num=gcd(n1,n2);
            ListNode dummy=new ListNode(num);
            dummy.next=curr.next;
            curr.next=dummy;
            curr=dummy.next;
        }
        return head;
    }
}