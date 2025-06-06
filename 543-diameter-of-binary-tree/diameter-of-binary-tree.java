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
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return result;
    }

    private int solve(TreeNode node) {
        if(node == null) return 0;

        int left = solve(node.left);
        int right = solve(node.right);
        
        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
}