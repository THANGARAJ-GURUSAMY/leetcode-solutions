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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        int[] res=new int[l.size()];
        int k=0;
        int i=0;
        while(i<l.size())
        {
            int num=l.get(i);
            int i1=i+1;
            int ans=0;
            while(i1<l.size())
            {
                if(l.get(i1)>num)
                {
                    ans=l.get(i1);
                    break;
                }
                i1++;

            }
            res[k++]=ans;
            i++;
        }
        return res;

    }
}