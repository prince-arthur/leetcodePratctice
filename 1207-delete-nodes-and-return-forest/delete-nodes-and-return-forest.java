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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int i: to_delete) set.add(i);
        List<TreeNode> list = new ArrayList<>();
        if(!set.contains(root.val)) list.add(root);
        depthFirstSearch(root, set, list);
        return list;
    }

    private TreeNode depthFirstSearch(TreeNode node, Set<Integer> set, List<TreeNode> list) {
        if(node == null) return null;
        node.left = depthFirstSearch(node.left, set, list);
        node.right = depthFirstSearch(node.right, set, list);
        if(set.contains(node.val)) {
            if(node.left!=null) list.add(node.left);
            if(node.right!=null) list.add(node.right);
            return null;
        }
        return node;
    }
}