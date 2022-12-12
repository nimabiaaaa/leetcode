package DuiLie.BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author: Mr_liao
 * @create: 2022-10-13 19:18
 * @description:
 **/
public class BFS {

    public static void main(String[] args) {
        Node F = new Node(null);
        Node E = new Node(new Node[]{F});
        Node D = new Node(null);
        Node C = new Node(new Node[]{E});
        Node B = new Node(new Node[]{D});
        Node root = new Node(new Node[] {B,C});

        System.out.println(BFS(root,F));
        System.out.println(BFS(root,E));
        System.out.println(BFS(C,E));
        System.out.println(BFS(C,F));

    }

    /**
     * 返回目标根节点与目标节点之间的最短距离
     * @param root
     * @return
     */
    int bfs(Node root,Node target){
        Queue<Node> queue = new LinkedList<>();
        //用于记录根节点到目标节点的最短路径
        int step = 0;
        //初始化
        if (root == null){
            return 0;
        }
        //将根节点加入队列中
        queue.add(root);
        while (!queue.isEmpty()){
            step = step + 1;
            //迭代队列中已经存在的节点
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

            }
        }
        return step;
    }

    /**
     * 广度优先遍历模板1
     * @param root
     * @param tar
     * @return
     */
    static int BFS(Node root,Node tar){
        Queue<Node> queue = new LinkedList<>();
        int step = 0;
        if (root == null){
            return 0;
        }
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.peek();

                if (cur == tar){
                    return step;
                }

                for (int j = 0;cur.neighbors != null && j < cur.neighbors.length; j++) {
                    queue.offer(cur.neighbors[j]);
                }

                queue.poll();
            }
            step++;
        }

        return -1;
    }

    /**
     * 模板2-确保我们永远不会访问一个结点两次
     * @param root
     * @param target
     * @return
     */
    static int BFS2(Node root,Node target){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> set = new HashSet<>();

        int step = 0;

        if (root == null){
            return 0;
        }

        queue.offer(root);
        set.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.peek();

                if (node == target){
                    return step;
                }

                for (int j = 0; node.neighbors != null && j < node.neighbors.length; j++) {
                    if (!set.contains(node.neighbors[j])){
                        queue.offer(node.neighbors[j]);
                        set.add(node.neighbors[j]);
                    }
                }
                queue.poll();
            }
            step++;
        }

        return -1;
    }

    static int BFS3(Node root,Node target){
        Queue<Node> queue = new LinkedList<>();

        if (root == null){
            return 0;
        }
        //统计步数
        int step = 0;
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.peek();

                if (node == target){
                    return step;
                }

                for (int j = 0; node.neighbors != null && j < node.neighbors.length; j++) {
                    //不考虑重复遍历过的节点是否应该入队
                    queue.offer(node.neighbors[j]);
                }

                queue.poll();
            }
            step++;
        }

        return -1;
    }

    static int BFS4(Node root,Node target){
        if(root == null){
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();

        HashSet<Node> set = new HashSet<>();

        int step = 0;

        queue.offer(root);
        set.add(root);

        while (!queue.isEmpty()){
            step++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.peek();

                if (node == target){
                    return step;
                }

                for (int j = 0; node.neighbors != null && j < node.neighbors.length; j++) {
                    if (!set.contains(node.neighbors[j])){
                        queue.offer(node.neighbors[j]);
                        set.add(node.neighbors[j]);
                    }
                }

                queue.poll();
            }
        }

        return -1;
    }
}
