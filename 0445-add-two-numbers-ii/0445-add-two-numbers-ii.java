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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l11=new ArrayList<>();
        List<Integer> l21=new ArrayList<>();
        while(l1!=null)
        {
            l11.add(l1.val);
            l1=l1.next;
            
        }
        while(l2!=null)
        {
            l21.add(l2.val);
            l2=l2.next;
        }
        int c=0;
        Collections.reverse(l11);
        Collections.reverse(l21);
        int size=Math.min(l11.size(),l21.size());
        int i=0;
        List<Integer> res=new ArrayList<>();
        while(i<size)
        {
           int num=l11.get(i)+l21.get(i)+c;
           res.add(num%10);
           c=num/10;
           i++;
        }
        while(i<l11.size())
        {
            int num=l11.get(i)+c;
            res.add(num%10);
            c=num/10;
            i++;
        }
        while(i<l21.size())
        {
            int num=l21.get(i)+c;
            res.add(num%10);
            c=num/10;
            i++;

        }
        if(c!=0)
        {
           res.add(c);
        }
        Collections.reverse(res);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int m=0;
        while(m<res.size())
        {
           ListNode t=new ListNode(res.get(m));
           curr.next=t;
           curr=curr.next;
           m++;
        }
        return dummy.next;


    }
}