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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        isValidBST(root.left);
        l.add(root.val);
        isValidBST(root.right);
        for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i)>=l.get(i+1))
            {
                return false;
            }

        }
        return true;
    }
}