package Stacks.DFS.cloneGraphCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 15:06
 * @description:
 **/
public class Solution2 {
    public static void main(String[] args) {

    }

    public Node cloneGraph(Node node) {
        return clone2(node,new HashMap<>());
    }

    private Node clone2(Node node, HashMap<Integer, Node> map) {
        if (node == null){
            return null;
        }

        if (map.containsKey(node.val)){
            return map.get(node.val);
        }

        Node newNode = new Node(node.val,new ArrayList<>());

        for (Node neighbor:node.neighbors){
            newNode.neighbors.add(clone2(neighbor,map));
        }

        return newNode;
    }
}
