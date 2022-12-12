package Stacks.DFS.inorderTraversalCode;

import DuiLie.openLock.TreeNode;

import java.util.*;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 16:44
 * @description:
 **/
public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null){
            return list;
        }

        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.left));
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//
//        while (cur != null || !stack.empty()){
//
//        }
        return list;
    }

    /**
     * 非递归-栈
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            if (!stack.empty()){
                TreeNode node = stack.pop();
                list.add(node.val);
                cur = node.right;
            }
        }

        return list;
    }
    /**
     * 非递归-栈
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null){
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<>();

        TreeNode cur =root;

        while (cur != null || !stack.isEmpty()){

            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            if (!stack.isEmpty()){
                TreeNode node = stack.pop();
                list.add(node.val);
                cur = node.right;
            }
        }

        return list;
    }
}
