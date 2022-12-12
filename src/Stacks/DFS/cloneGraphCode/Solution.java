package Stacks.DFS.cloneGraphCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 14:05
 * @description: 克隆图
 **/
public class Solution {
    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        return clone(node,new HashMap<>());
    }

    private Node clone(Node node, HashMap<Integer, Node> visited) {
        //边界条件判断
        if (node == null){
            return null;
        }
        //如果当前节点已经创建了，直接返回
        //一般这里，递归到最后一个节点可能会判断进来
        if (visited.containsKey(node.val)){
            return visited.get(node.val);
        }
        //否则创建当前节点
        Node newNode = new Node(node.val,new ArrayList<>());
        //把创建的节点存放到map中
        visited.put(newNode.val,newNode);
        //创建当前节点的邻居节点
        for (Node neighbor:node.neighbors){
            newNode.neighbors.add(clone(neighbor,visited));
        }
        return newNode;
    }
}
