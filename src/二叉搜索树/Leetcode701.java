package 二叉搜索树;

import 树的遍历.TreeNode;

public class Leetcode701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        TreeNode temp = root;
        if (root == null) return node;
        if (val >= root.val){
            if (root.right == null){
                root.right = node;
            }
            else {
                insertIntoBST(root.right, val);
            }
        }
        else {
            if (root.left == null){
                root.left = node;
            }
            else {
                insertIntoBST(root.left, val);
            }
        }
        return temp;
    }

    public TreeNode insertIntoBST2(TreeNode root, int val){
        TreeNode node = new TreeNode(val);
        TreeNode dummy = root;
        if (root == null) return node;

        while (dummy != null){
            if (dummy.val >= val){
                if (dummy.left == null){
                    dummy.left = node;
                    break;
                }
                else {
                    dummy = dummy.left;
                }
            }
            else {
                if (dummy.right == null){
                    dummy.right = node;
                    break;
                }
                else{
                    dummy = dummy.right;
                }
            }
        }
        return root;
    }
}
