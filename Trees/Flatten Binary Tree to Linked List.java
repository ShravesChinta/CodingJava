class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return; // If the tree is empty, there's nothing to flatten
        }

        Stack<TreeNode> s = new Stack<>();
        s.add(root);

        TreeNode prev = null; // Keep track of the previous node

        while (!s.isEmpty()) {
            TreeNode current = s.pop();

            // If the previous node is not null, make it point to the current node
            if (prev != null) {
                prev.right = current;
                prev.left = null;
            }

            // Push the right and left children onto the stack (if not null)
            if (current.right != null) {
                s.push(current.right);
            }
            if (current.left != null) {
                s.push(current.left);
            }

            // Update the previous node
            prev = current;
        }
    }
}
