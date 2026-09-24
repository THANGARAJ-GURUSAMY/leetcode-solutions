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
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        find(root,targetSum, new ArrayList<>());
        return l;

    }
    void find(TreeNode root, int targetSum, List<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.val);
        targetSum -= root.val;
        if(root.left == null && root.right == null){
            if(targetSum == 0){
                l.add(new ArrayList<>(path));
            }
        }
        find(root.left, targetSum, path);
        find(root.right, targetSum, path);

        path.remove(path.size() - 1);
    }
  
}