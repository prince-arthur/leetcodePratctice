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

    List<String> res = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return res;
        StringBuilder sb = new StringBuilder();
        dfs(root, sb, res);
        return res;
    }

    private void dfs(TreeNode root, StringBuilder sb, List<String> res) {
        if(root.left == null && root.right == null) {
            sb.append("" + root.val);
            res.add(sb.toString());
            return;
        }
        if(root.left != null) {
            String prev = sb.toString();
            sb.append(root.val + "->");
            dfs(root.left, sb, res);
            sb = new StringBuilder(prev);
        }
        if(root.right != null) {
            sb.append(root.val + "->");
            dfs(root.right, sb, res);
        }
    }
}