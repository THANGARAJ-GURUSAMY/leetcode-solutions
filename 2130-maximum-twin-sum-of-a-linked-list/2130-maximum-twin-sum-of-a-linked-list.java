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
    public int pairSum(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=l.size()-1;
        int max=Integer.MIN_VALUE;
        while(left<=right)
        {
            int num=l.get(left)+l.get(right);
            max=Math.max(max,num);
            left++;
            right--;
        }
        return max;

    }
}