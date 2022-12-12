package Stacks.DFS.cloneGraphCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr_liao
 * @create: 2022-10-27 14:06
 * @description:
 **/
public class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
