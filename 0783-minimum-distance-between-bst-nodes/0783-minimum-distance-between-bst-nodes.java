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
    public int minDiffInBST(TreeNode root) {
        if(root==null)
        {
            return 0;

        }
        int min=Integer.MAX_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=q.poll();
                l.add(temp.val);
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                    
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                    
                }
            }
        }
        Collections.sort(l);
        for(int i=1;i<l.size();i++)
        {
            int num=Math.abs(l.get(i)-l.get(i-1));
            min=Math.min(min,num);
        }
        return min;

    }
}