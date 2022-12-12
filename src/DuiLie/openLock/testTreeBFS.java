package DuiLie.openLock;

import Tree.TwoTreeTest.levelOrder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Mr_liao
 * @create: 2022-10-19 15:10
 * @description:
 **/
public class testTreeBFS {
    public static void main(String[] args) {

    }

    public void levelOrder(TreeNode tree){
        if (tree == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(tree);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            System.out.println(node.val);

            if (node.left != null){
                queue.offer(node.left);
            }

            if (node.right != null){
                queue.offer(node.right);
            }
        }
    }

    public void levelOrder2(TreeNode tree){
        Queue<TreeNode> queue = new LinkedList<>();

        if (tree == null){
            return;
        }

        queue.offer(tree);
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                System.out.println(node.val);

                if (node.left != null){
                    queue.offer(node.left);
                }

                if (node.right != null){
                    queue.offer(node.right);
                }
            }

            level++;

            System.out.println(level);
        }
    }
}
