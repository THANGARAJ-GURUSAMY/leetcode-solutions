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
        find(root,targetSum,new ArrayList<>());
        return l;
    }
    void find(TreeNode root,int sum,List<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.val);
        sum-=root.val;
        if(root.left==null&&root.right==null)
        {
            if(sum==0)
            {
                l.add(new ArrayList<>(path));
            }
        }
        find(root.left,sum,path);
        find(root.right,sum,path);
        path.remove(path.size()-1);
    }
}