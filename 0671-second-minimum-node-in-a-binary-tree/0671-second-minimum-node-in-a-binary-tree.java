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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        Set<Integer> set=new TreeSet<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode t=q.poll();
                set.add(t.val);
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
            }
        }
        List<Integer> l=new ArrayList<>(set);
        if(l.size()<=1)
        {
            return -1;
        }
        return l.get(1);

    }
}