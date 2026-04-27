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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        int c=0;
        while(c!=b+1)
        {
            if(c>=a)
            {
                list1=list1.next;
                
            }
            else
            {
               dummy.next=new ListNode(list1.val);
               dummy=dummy.next;
               list1=list1.next;
            }
            c++;
            
        }
        while(list2!=null)
        {
            dummy.next=new ListNode(list2.val);
            dummy=dummy.next;
            list2=list2.next;
        }
        while(list1!=null)
        {
            dummy.next=new ListNode(list1.val);
            dummy=dummy.next;
            list1=list1.next;
        }
        return res.next;
        
    }
}