/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        increasingBST(root.left);
        l.add(root.val);
        increasingBST(root.right);
        TreeNode cur=new TreeNode(l.get(0));
        TreeNode head=cur;
        for(int i=1;i<l.size();i++)
        {
            TreeNode temp=new TreeNode(l.get(i));
            cur.right=temp;
            cur=temp;
        }
        return head;
    }
}