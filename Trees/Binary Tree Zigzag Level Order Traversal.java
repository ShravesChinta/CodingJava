class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> l =new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        if(root==null)
        return result;

        q.add(root);
        while(q.size()>0)
        {
            l=new ArrayList<>();
            int size= q.size();
            while(size>0)
            {
                TreeNode temp=q.remove();
                l.add(temp.val);

            if(temp.left!=null)
            q.add(temp.left);

            if(temp.right!=null)
            q.add(temp.right);

            size--;

            }
            if(level%2!=0)
            {
                Collections.reverse(l);
            }
                result.add(l);
                level++;
        }
        return result;
    }
}
