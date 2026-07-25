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


class BSTIterator {

    List<Integer> inorder = new ArrayList<>();
    int index = -1;

    public BSTIterator(TreeNode root) {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        inorder.add(node.val);
        inorder(node.right);
    }

    public int next() {
        index++;
        return inorder.get(index);
    }

    public boolean hasNext() {
        return index + 1 < inorder.size();
    }
}