package 递归;

import 树的遍历.TreeNode;

/**
 * 二叉树中不相邻结点的和最大值
 */
public class MaxVal {

    public int maxSum(TreeNode root){
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null){
            sum += maxSum(root.left.left) + maxSum(root.left.right);
        }
        if (root.right != null){
            sum += maxSum(root.right.left) + maxSum(root.right.right);
        }

        return Math.max(sum + root.val, maxSum(root.left) + maxSum(root.right));
    }
}
