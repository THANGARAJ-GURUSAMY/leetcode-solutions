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
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        preorder(p);
        preorder1(q);
        if(l1.size()!=l2.size())
        {
            return false;
        }
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i)==null&&l2.get(i)==null)
            {

                continue;
            }
            if(l1.get(i)==null||l2.get(i)==null)
            {
                return false;
            }
            if(!l1.get(i).equals(l2.get(i)))
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> preorder(TreeNode root)
    {
        if(root == null){
            l1.add(null);
            return l1;
        }
        l1.add(root.val);
        preorder(root.left);
        preorder(root.right);
        return l1;
    }
    public List<Integer> preorder1(TreeNode root)
    {
        if(root == null){
            l2.add(null);
            return l2;
        }
        l2.add(root.val);
        preorder1(root.left);
        preorder1(root.right);
        return l2;
    }
}