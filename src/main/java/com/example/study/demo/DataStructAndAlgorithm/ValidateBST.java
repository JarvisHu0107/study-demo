package com.example.study.demo.DataStructAndAlgorithm;

import com.example.study.demo.DataStructAndAlgorithm.Bean.TreeNode;

import java.util.Stack;

/**
 * 验证是否为搜索二叉树
 */
public class ValidateBST {
    /**
     * 解法1：递归
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    private boolean helper(TreeNode root,Integer lower,Integer upper) {
        //terminator
        if(root == null) {
            return true;
        }

        //process this level
        int curVal = root.val;

        if(lower != null && root.val <= lower) return false;

        if(upper != null && root.val >= upper) return false;

        //drill down
        if(!helper(root.right,curVal,upper)) return false;

        if(!helper(root.left,lower,curVal)) return false;

        return true;
    }


    /**
     * 解法2：中序遍历（递增）
     * @param root
     * @return
     */
    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double lastVal = - Double.MAX_VALUE;
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= lastVal) return false;
            lastVal = root.val;
            root = root.right;
        }
        return true;
    }

}
