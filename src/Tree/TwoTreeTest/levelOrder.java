package Tree.TwoTreeTest;

import java.util.*;

/**
 * @author: Mr_liao
 * @create: 2022-10-11 15:40
 * @description: 二叉树的层序遍历
 **/
public class levelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int n = queue.size();

            List<Integer> list = new ArrayList<>();
            //遍历完每一层元素
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            res.add(list);
        }

        return res;
    }

    public static void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms[0].length == 0 || rooms == null)
            return;
        for (int i = 0; i < rooms.length; i++)
            for (int j = 0; j < rooms[i].length; j++)
                if (rooms[i][j] == 0)
                    BFS(rooms, i, j);
    }

    public static void BFS(int[][] r, int i, int j) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        int dist = 0;
        //这里的存储方式很好，不仅确保了数据唯一性，这样也便于后面的拆分！
        queue.add(i * r[i].length + j);
        set.add(i * r[i].length + j);
        int size;

        while (!queue.isEmpty()) {
            size = queue.size();
            for (int k = 0; k < size; k++) {
                int target = queue.poll();
                int row = target / r[i].length;
                int col = target % r[i].length;

                //剪枝（2）
                if (r[row][col] <= dist && !(r[row][col] == 0))
                    continue;
                r[row][col] = Math.min(r[row][col], dist);
                int up = row - 1;
                int down = row + 1;
                int left = col - 1;
                int right = col + 1;

                //剪枝（1）
                if (up >= 0 && r[up][col] > 0 && !(set.contains(up * r[i].length + col))) {
                    queue.add(up * r[i].length + col);
                    set.add(up * r[i].length + col);
                }
                if (down < r.length && r[down][col] > 0 && !(set.contains(down * r[i].length + col))) {
                    queue.add(down * r[i].length + col);
                    set.add(down * r[i].length + col);
                }
                if (left >= 0 && r[row][left] > 0 && !(set.contains(row * r[i].length + left))) {
                    queue.add(row * r[i].length + left);
                    set.add(row * r[i].length + left);
                }
                if (right < r[row].length && r[row][right] > 0 && !(set.contains(row * r[i].length + right))) {
                    queue.add(row * r[i].length + right);
                    set.add(row * r[i].length + right);
                }
            }
            dist++;
        }
    }



}
