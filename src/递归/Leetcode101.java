package 递归;

import 树的遍历.TreeNode;

public class Leetcode101 {
    public boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return help(root.left, root.right);
    }

    public boolean help(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
