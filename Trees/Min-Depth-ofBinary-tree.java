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
    public int minDepth(TreeNode root) {
       return minDepthR(root, 0); 
    }

    public static int minDepthR(TreeNode root, int depth)
    {
        if(root==null)
        return depth;

        if(root.left==null && root.right==null)
        return depth+1;

        if(root.left==null)
        return minDepthR(root.right, depth+1);

        if(root.right==null)
        return minDepthR(root.left, depth+1);

        return Math.min(minDepthR(root.left,depth+1),minDepthR(root.right,depth+1));
    }
}
