/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private boolean traverse(TreeNode root, int sum, int target) {
        if (root == null)
            return false;
        sum += root.val;
        if (sum == target && root.left == null && root.right == null)
            return true;
        return traverse(root.right, sum, target) || traverse(root.left, sum, target);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        boolean flag = traverse(root, 0, targetSum);
        return flag;
    }
}