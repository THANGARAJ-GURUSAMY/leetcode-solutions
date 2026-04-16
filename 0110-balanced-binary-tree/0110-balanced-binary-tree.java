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
    int left=0;
    int right=0;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        left=Height(root.left);
        right=Height(root.right);
        int d=Math.abs(left-right);
        if(d==0||d==1)
        {
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        else
        {
            return false;
        }
    }
    public int Height(TreeNode root)
    {
        if(root==null)
        {
            return 0;

        }
        return 1+Math.max(Height(root.left),Height(root.right));
    }
}