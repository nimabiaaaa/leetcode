package Stacks.DFS;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 11:33
 * @description:
 **/
public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;
    public TreeNode(int v) {
        val = v;
    }
    public TreeNode(int v, TreeNode l, TreeNode r) {
        this(v);
        left = l;
        right = r;
    }
}
