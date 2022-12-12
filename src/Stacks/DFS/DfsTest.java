package Stacks.DFS;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 11:24
 * @description:
 **/
public class DfsTest {
    public static void main(String[] args) {
        TreeNode t4 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2,t4,null);
        TreeNode t2 = new TreeNode(1);
        TreeNode root = new TreeNode(0,t2,t3);
        Set<TreeNode> visited = new HashSet<>();
        //dfs 输出是否存在路径
        System.out.println(DFS(root, t4, visited));
    }

    static boolean DFS(TreeNode cur, TreeNode target, Set<TreeNode> visited){
        if (cur == target){
            return true;
        }

        TreeNode left = cur.left;
        TreeNode right = cur.right;

        // 递归
        if (left != null && !visited.contains(left)){
            visited.add(left);
            System.out.println(cur.val + "->" + left.val);
            if (DFS(left,target,visited)){
                return true;
            }
        }

        if (right != null && !visited.contains(right)){
            visited.add(right);
            System.out.println(cur.val + "->" + right.val);
            if (DFS(right,target,visited)){
                return true;
            }
        }

        return false;
    }
}
