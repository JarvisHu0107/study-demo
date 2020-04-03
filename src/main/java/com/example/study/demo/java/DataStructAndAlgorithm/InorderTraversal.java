package com.example.study.demo.java.DataStructAndAlgorithm;

import com.example.study.demo.java.DataStructAndAlgorithm.Bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中序遍历
 */
public class InorderTraversal {


    /**
     * 解1：递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        return helper(root,res);
    }


    private List<Integer> helper (TreeNode root,List<Integer> res){

        if(root != null && root.left != null) {
            helper(root.left,res);
        }
        if(root != null){
            res.add(root.val);
        }
        if(root != null && root.right != null) {
            helper(root.right,res);
        }
        return res;
    }


    /**
     * 解2：栈
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        TreeNode cur = root;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(cur!=null || !stack.isEmpty()) {
            while(cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }


    /**
     * 解法2变形，本质一摸一样
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(stack.size()>0 || root!=null) {
            if(root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode tmp = stack.pop();
                res.add(tmp.val);
                root = tmp.right;
            }
        }
        return res;
    }



}
