package 递归;

import 树的遍历.TreeNode;

public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTree2(TreeNode root){
        if (root == null) return null;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        if (root.left != null) {
            return invertTree2(root.left);
        }
        if (root.right != null){
            return invertTree2(root.right);
        }
        return root;
    }
}
