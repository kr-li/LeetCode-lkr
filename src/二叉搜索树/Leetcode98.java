package 二叉搜索树;

import 树的遍历.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode98 {
    public boolean isValidBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        int currentNum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= currentNum){
                return false;
            }
            currentNum = list.get(i);
        }
        return true;
    }

    public void dfs(TreeNode root, List<Integer> list){
        if (root == null) return;
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }

    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double num = -Double.MAX_VALUE;
        if (root == null) return true;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= num){
                return false;
            }
            num = root.val;
            root = root.right;
        }
        return true;
    }
}
