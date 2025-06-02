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

    List<String> rootToLeafPaths = new ArrayList<String>();
    public int sumNumbers(TreeNode root) {
        int ans = 0;
        dfs(root, "");
        for(String curr: rootToLeafPaths) {
            int currVal = Integer.parseInt(curr);
            ans += currVal;
        }
        return ans;
    }

    private void dfs(TreeNode node, String currPath) {
        if(node == null) return;
        currPath += Integer.toString(node.val);
        dfs(node.left, currPath);
        dfs(node.right, currPath);
        if(node.left == null && node.right == null) {
            rootToLeafPaths.add(currPath);
        }
    }
}