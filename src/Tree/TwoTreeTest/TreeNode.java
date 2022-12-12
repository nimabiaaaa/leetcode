package Tree.TwoTreeTest;

/**
 * @author: Mr_liao
 * @create: 2022-10-09 16:34
 * @description:
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}

    public TreeNode(int val){
        this.val =val;
    }

    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
