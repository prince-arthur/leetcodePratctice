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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        solve(root, targetSum, new ArrayList<Integer>(), res);
        return res;
    }

    private void solve(TreeNode node, int sum, List<Integer> sol, List<List<Integer>> res) {
        if(node == null) return;

        sol.add(node.val);

        if(node.left == null && node.right == null && sum == node.val) {
            res.add(new ArrayList<Integer>(sol));
        } else {
            solve(node.left, sum - node.val, sol, res);
            solve(node.right, sum - node.val, sol, res);
        }

        sol.remove(sol.size() - 1);
    }
}