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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return count;
        }
        find(root,(long)targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
    public void find(TreeNode root, long targetSum){
        if(root == null){
            return;
        }
        targetSum-=root.val;
        if(targetSum==0){
            count++;
        }
        find(root.left,targetSum);
        find(root.right,targetSum);
    }
}