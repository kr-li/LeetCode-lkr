package 树的遍历;

public class Leetcode110 {
    public boolean isBalanced(TreeNode root){
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(hight(root.right) - hight(root.left)) <= 1;
    }

    public int hight(TreeNode root){
        if (root == null) return 0;
        return Math.max(hight(root.left), hight(root.right)) + 1;
    }
}
