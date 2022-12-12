package Tree.TwoTreeTest;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 16:39
 * @description:
 **/
public class TreeNodeTest {
    public static void main(String[] args) {
        //构建二叉树
        TreeNode root = new TreeNode(4);
        TreeNode temp1 = new TreeNode(1);
        TreeNode temp2 = new TreeNode(2);
        TreeNode temp3 = new TreeNode(3);
        TreeNode temp5 = new TreeNode(5);

        root.left = temp2;
        root.right = temp5;
        temp2.right = temp3;
        temp2.left = temp1;

        System.out.println("前序");
        pre(root);
        System.out.println();
        System.out.println("中序");
        cur(root);
        System.out.println();
        System.out.println("后序");
        nxt(root);
    }
    //前序
    public static void pre(TreeNode root){
        if (root == null){
            return;
        }

        System.out.print(root.val);
        pre(root.left);
        pre(root.right);
    }
    //中序
    public static void cur(TreeNode root){
        if (root == null){
            return;
        }

        cur(root.left);
        System.out.print(root.val);
        cur(root.right);
    }
    //后序
    public static void nxt(TreeNode root){
        if (root == null){
            return;
        }

        nxt(root.left);
        nxt(root.right);
        System.out.print(root.val);
    }

    /**
     * 递归方法
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        pre2(root,list);
        return list;
    }

    private void pre2(TreeNode root, List<Integer> list) {
        if (root == null){
            return;
        }

        list.add(root.val);
        pre2(root.left,list);
        pre2(root.right,list);
    }

    /**
     * 迭代方法
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        //定义一个栈
        Deque<TreeNode> stack = new LinkedList<>();

        TreeNode node = root;

        while (!stack.isEmpty() || node != null){
            while (node != null){
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }

            //当左子树为空，则遍历右子树
            node = stack.pop();
            node = node.right;
        }

        return res;
    }

    public List<Integer> preorderTraversal3(TreeNode root){
        List<Integer> res = new ArrayList<>();

        if (root ==null){
            return res;
        }

        //定义一个栈
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }

            //左子树为空，弹出栈中一个元素，遍历右子树
            node = stack.pop();
            node = node.right;
        }

        return res;
    }
}
