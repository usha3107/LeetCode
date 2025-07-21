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
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        Path(root, ""); 
        return ans;
    }

    public void Path(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            ans.add(path + root.val);  
        }

        if (root.left != null)
            Path(root.left, path + root.val + "->");

        if (root.right != null)
            Path(root.right, path + root.val + "->");
    }
}